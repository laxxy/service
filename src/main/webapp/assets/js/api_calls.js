/**
 * Created by cosxt on 10/20/2017.
 */
function startQueue() {

/*
     var station_from = JSON.stringify('station_from');
     var from = '\"' + $('#from').text() + '\"';
     var station_till = '\"station_till\"';
     var till = '\"' + $('#to').text() + '\"';
     var dateDep = '\"dateDep\"';
     var date = '\"' + $('#date').text() + '\"';

     JSON.stringify({
     station_from:from,
     station_till:till,
     dateDep:date
     });


   var param = jQuery.param({
        station_from : $('#from').text(),
        station_till : $('#to').text(),
        dateDep : $('#date').text()
    });*/

    $.ajax({
        type : "POST",
        contentType : "application/json;charset=UTF-8",
        url : '/service',
        data : JSON.stringify({
            station_from : $('#from').text(),
            station_till : $('#to').text(),
            dateDep : $('#date').text()
        }),
        dataType : 'json',
        timeout : 1000,
        success : function(data) {
            display(JSON.stringify(data));
        },
        error : function(e) {
            //console.log("ERROR: ", e);
            //display(e);
        },
        done : function(e) {
            //console.log("DONE");
        }
    });
}