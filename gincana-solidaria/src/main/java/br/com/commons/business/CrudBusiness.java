package br.com.commons.business;

public interface CrudBusiness {

	public <T> T insert (T t);
	
	public <T> T update (T t);
	
	public <T> T delete (T t);
	
	public <T> T find (T t);
}
