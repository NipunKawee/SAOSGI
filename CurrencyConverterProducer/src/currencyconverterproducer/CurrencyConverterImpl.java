package currencyconverterproducer;

import exchangerateproducer.ExchangeRate;

public class CurrencyConverterImpl implements CurrencyConverterInterface{

	@Override
	public float convert(ExchangeRate ex,float value,String countryCode) {
		// TODO Auto-generated method stub
		ex.get(countryCode);
		return 0;
	}

}
