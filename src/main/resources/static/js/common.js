

var commonUtil={
    getUrlParam:function (name) {
        var reg = new RegExp("(^|&)"+ name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (null != r){
            return decodeURI(r[2]);
        }
    }
}