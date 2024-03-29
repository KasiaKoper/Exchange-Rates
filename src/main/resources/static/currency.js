$(document).ready(function() {

    currencyApi("usd");
    currencyApi("eur");

    function currencyApi(currency){
        $.ajax({
            url: "http://localhost:8080/api/exchangerates/"+currency
        }).then(function(data) {
            $("#currency-"+currency).text(data.currency);
            $("#exchange-rate-"+currency).text(data.rates[0].bid+' zł');
        });
    }
});