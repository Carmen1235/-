function dataFormatter(value, rec, index) {
    if (value == undefined) {
        return "";
    }
    /*json格式时间转js时间格式*/
    var date = new Date(value);
    return date.getFullYear() + '/' + (date.getMonth() + 1) + '/' + date.getDate()+'  ';
}


function dataFormatter2(value) {
    if (value == undefined) {
        return "";
    }
    /*json格式时间转js时间格式*/
    var date = new Date(value);
    return date.getFullYear() + '-' + (date.getMonth() + 1) + '-' + date.getDate()+'  '+date.getHours()+":"+date.getMinutes();
}




