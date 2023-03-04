package exchangerateproducer;

public interface ExchangeRate {
	
	public void add(String countryCode,float rate);
	public void update(String countryCode,float rate);
	public void delete(String countryCode);
	public float get(String countryCode);

}
