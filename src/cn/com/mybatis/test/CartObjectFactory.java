package cn.com.mybatis.test;

import java.util.List;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import cn.com.mybatis.po.ShoppingCart;

public class CartObjectFactory extends DefaultObjectFactory{
	@Override
	public <T> T create(Class<T> type) {
		// TODO Auto-generated method stub
		return super.create(type);
	}
	
	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		T ret = super.create(type, constructorArgTypes, constructorArgs);
		if (ShoppingCart.class.isAssignableFrom(type)) {
			ShoppingCart entity = (ShoppingCart) ret;
			entity.init();
		}
		return ret;
	}
	
}
