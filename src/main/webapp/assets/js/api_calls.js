/**
 * Created by cosxt on 10/20/2017.
 */
function startQueue() {

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
        timeout : 1000000,
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