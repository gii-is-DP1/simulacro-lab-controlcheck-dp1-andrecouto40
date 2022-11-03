package org.springframework.samples.petclinic.product;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeFormatter implements Formatter<ProductType>{
    ProductService productService;

    @Override
    public String print(ProductType object, Locale locale) {

        return object.getName();
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        ProductType result=productService.findByNameProductType(text);
        if(result==null){
            throw new ParseException(text, 0);
        }else{
            return result;
        }
        
    }
    
}
