package com.lzw.dao.model;

public class TbSpinfo implements java.io.Serializable{
	private String id;//id属性
	private String spname;//商品名称
	private String jc;//商品简介
	private String cd;//产地
	private String dw;//单位
	private String gg;//规格
	private String bz;//包装
	private String ph;//批号
	private String pzwh;//批准编号
	private String memo;//备注
	private String gysname;//供应商名称
	public TbSpinfo(){
		//默认构造方法
	}
	public TbSpinfo(String id,String spname){
		this.id=id;
		this.spname=spname;
		//包含所有属性初始化的构造方法
	}
	public String getId(){
		return id;//获得id属性的方法
	}
	public void setId(String id){
		this.id=id;//设置id属性的方法
	}
	public String getSpname(){
		return spname;//获得name属性的方法
	}
	public void setSpaame(String name){
		this.spname=name;//设置name属性的方法
	}
	public String toString(){
		//重写toString()方法
		return getSpname();
	}
	@Override
	public int hashCode(){
		//重写生成hashcode（）方法
		final int PRIME=31;
		int result=1;
		result=PRIME*result+((bz==null)?0:bz.hashCode());
		result=PRIME*result+((cd==null)?0:cd.hashCode());
		result=PRIME*result+((dw==null)?0:dw.hashCode());
		result=PRIME*result+((gg==null)?0:gg.hashCode());
		result=PRIME*result+((gysname==null)?0:gysname.hashCode());
		result=PRIME*result+((id==null)?0:id.hashCode());
		result=PRIME*result+((jc==null)?0:jc.hashCode());
		result=PRIME*result+((memo==null)?0:memo.hashCode());
		result=PRIME*result+((pzwh==null)?0:pzwh.hashCode());
		result=PRIME*result+((spname==null)?0:spname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj){
		//重写equals()方法
		if(this==obj) return true;
		if(this==null) return false;
		if(getClass()!=obj.getClass()) return false;
		final TbSpinfo other=(TbSpinfo) obj;
		if(bz==null){
			if(other.bz!=null)
				return false;
		}else if(!bz.equals(other.bz))
			return false;
		if(id==null){
			if(other.id!=null) return false;
		}else if(!id.equals(other.id)) return false;
		if(jc==null){
			if(other.jc!=null) return false;
		}else if(!jc.equals(other.jc)) return false;
		if(cd==null){
			if(other.cd!=null) return false;
		}else if(!cd.equals(other.id)) return false;
		if(dw==null){
			if(other.dw!=null) return false;
			}else if(!dw.equals(other.dw)) return false;
		if(gg==null){
			if(other.gg!=null) return false;
		}else if(!gg.equals(other.gg))return false;
		if(ph==null){
			if(other.ph!=null) return false;
		}else if(!ph.equals(other.ph)) return false;
		if(pzwh==null){
			if(other.pzwh!=null) return false;
		}else if(!pzwh.equals(other.pzwh)) return false;
		if(memo==null){
			if(other.memo!=null) return false;
		}else if(!memo.equals(other.memo)) return false;
		if(gysname==null){
			if(other.gysname!=null) return false;
		}else if(!gysname.equals(other.gysname)) return false;
		if(spname==null){
			if(other.spname!=null) return false;
		}else if(!spname.equals(other.spname)) return false;
		return true;
	}
}
