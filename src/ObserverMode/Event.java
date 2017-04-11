package ObserverMode;

import java.lang.reflect.Method;

/**
 * �¼�����ķ�װ
 * 
 * @author 83771
 *
 */
public class Event {

	// Ҫִ�еķ����Ķ���
	private Object object;
	// Ҫִ�еķ�������
	private String method;
	// Ҫִ�з����Ĳ���
	private Object[] params;
	// Ҫִ�з����Ĳ�������
	private Class[] paramTypes;

	public Event() {

	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public Class[] getParamTypes() {
		return paramTypes;
	}

	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}

	public Event(Object object, String method, Object... params) {
		super();
		this.object = object;
		this.method = method;
		this.params = params;
		createTypes(params);
	}

	// ���ݲ����������ɲ�����������
	private void createTypes(Object... params) {
		this.paramTypes = new Class[params.length ];
		System.out.println("hello"+params.length);
		for (int i = 0; i < params.length ; i++) {
			System.out.println(params[i].getClass().getName());
			paramTypes[i] = params[i].getClass();
		}
	}

	public void invoke() throws Exception {
		Method method = object.getClass().getMethod(this.getMethod(), this.getParamTypes());
		if (null == method) {
			return;
		}
		method.invoke(this.getObject(), this.getParams());
	}

}
