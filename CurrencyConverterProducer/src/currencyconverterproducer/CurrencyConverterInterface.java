package currencyconverterproducer;

import exchangerateproducer.ExchangeRate;

public interface CurrencyConverterInterface {

	float convert(ExchangeRate ex,float value,String countryCode);
}
