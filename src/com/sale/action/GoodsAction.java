package com.sale.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Random;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sale.model.Goods;
import com.sale.model.Seller;
import com.sale.service.GoodsService;
import com.sale.service.LoginService;

public class GoodsAction extends ActionSupport {
	@Resource
	GoodsService goodsService;
		
	private Goods goods;
	private List list;
	private List timelist;
	private List salelist;
	private int pageNo = 1;
	private int pageSize = 4;
	private int pageCount;
	private String redirect;
	private static final int BUFFER_SIZE = 400 * 400;
	private File upload;// 封装上传文件域的属性
	private String uploadContentType;// 封装上传文件的类型
	private String uploadFileName;// 封装上传文件名
	private String savePath;// 封装上传文件的保存路径

	private static void copy(File source, File target) {
		InputStream inputStream = null; // 声明一个输入流
		OutputStream outputStream = null; // 声明一个输出流
		try {
			inputStream = new BufferedInputStream(new FileInputStream(source),
					BUFFER_SIZE); // 实例化输入流
			outputStream = new BufferedOutputStream(
					new FileOutputStream(target), BUFFER_SIZE);// 实例化输出流
			byte[] buffer = new byte[BUFFER_SIZE]; // 定义字节数组buffer
			int length = 0; // 定义临时参数对象
			while ((length = inputStream.read(buffer)) > 0) { // 如果上传的文件字节数大于0
				outputStream.write(buffer, 0, length); // 将内容以字节形式写入

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != inputStream) {
				try {
					inputStream.close(); // 关闭输入流
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (null != outputStream) {
				try {
					outputStream.close(); // 关闭输出流
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	@Override
	public String execute() throws Exception {
		if(redirect.equals("delete"))
		return findGoodsListBySeller();
		else if(redirect.equals("addShopCart"))
			return findGoodsListAll();
		else
			return null;
	}

	public String findGoodsListBySeller() {
		ActionContext ac = ActionContext.getContext();
		String sellerId=(String)ac.getSession().get("Id");
		pageCount=goodsService.getPageCountBySeller(pageSize,sellerId);
        if(pageNo<=0)
        	pageNo=1;
        else if(pageNo>pageCount)
        	pageNo=pageCount;
		list = goodsService.getGoodsListBySeller(sellerId,pageNo,pageSize);
		ac.getSession().put("list", list);
		return "success";
	}
	
	public String findGoodsListAll(){
		ActionContext ac = ActionContext.getContext();
		pageCount=goodsService.getPageCountAll(pageSize);
        if(pageNo<=0)
        	pageNo=1;
        else if(pageNo>pageCount)
        	pageNo=pageCount;
		list = goodsService.getGoodsListAll(pageNo,pageSize);
		ac.getSession().put("list", list);
		return "goodslist";
	}

	public String addGoods() {
		String path = ServletActionContext.getServletContext().getRealPath(
				this.getSavePath())
				+ "\\" + this.getUploadFileName();		
		goods.setGoodsPic(this.uploadFileName);// 将上传的文件名称赋值给User类中的photo属性
		File target = new File(path); // 定义目标文件对象
		copy(this.upload, target); // 调用copy()方法，实现文件的写入
		ActionContext ac=ActionContext.getContext();
		System.out.println(ac.getSession().get("Id"));
		Seller seller=new Seller(); 
		seller.setSellerId((String)ac.getSession().get("Id"));
		goods.setSeller(seller);
		goodsService.addGoodsBySeller(goods);
		return "addgoods";
	}
	
	public String findGoods(){
		goods=goodsService.getGoodsBygoodsId(goods.getGoodsId());
		return "goods";
	}
	
	public String findGoodsToCustom(){
		goods=goodsService.getGoodsBygoodsId(goods.getGoodsId());
		return "goodsinfo";
	}
	
	public String updateGoods(){
		String path = ServletActionContext.getServletContext().getRealPath(
				this.getSavePath())
				+ "\\" + this.getUploadFileName();		
		goods.setGoodsPic(this.uploadFileName);// 将上传的文件名称赋值给User类中的photo属性
		File target = new File(path); // 定义目标文件对象
		copy(this.upload, target); // 调用copy()方法，实现文件的写入
		goodsService.updateGoods(goods);
		return "update";
	}
	
	public String deleteGoods(){
		goodsService.deleteGoodsBygoodsId(goods);
		return "delete";
	}
	
	public String loadindex(){
		System.out.println("successfully");
		timelist=goodsService.getGoodsListTop4ByTime();
		salelist=goodsService.getGoodsListTop4BySaleNum();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.getSession().setAttribute("load", "false");
		return "index";
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	/**
	 * @return the upload
	 */
	public File getUpload() {
		return upload;
	}

	/**
	 * @param upload the upload to set
	 */
	public void setUpload(File upload) {
		this.upload = upload;
	}

	/**
	 * @return the uploadContentType
	 */
	public String getUploadContentType() {
		return uploadContentType;
	}

	/**
	 * @param uploadContentType the uploadContentType to set
	 */
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	/**
	 * @return the uploadFileName
	 */
	public String getUploadFileName() {
		return uploadFileName;
	}

	/**
	 * @param uploadFileName the uploadFileName to set
	 */
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	/**
	 * @return the savePath
	 */
	public String getSavePath() {
		return savePath;
	}

	/**
	 * @param savePath the savePath to set
	 */
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * @return the redirect
	 */
	public String getRedirect() {
		return redirect;
	}

	/**
	 * @param redirect the redirect to set
	 */
	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	/**
	 * @return the timelist
	 */
	public List getTimelist() {
		return timelist;
	}

	/**
	 * @param timelist the timelist to set
	 */
	public void setTimelist(List timelist) {
		this.timelist = timelist;
	}

	/**
	 * @return the salelist
	 */
	public List getSalelist() {
		return salelist;
	}

	/**
	 * @param salelist the salelist to set
	 */
	public void setSalelist(List salelist) {
		this.salelist = salelist;
	}

}
