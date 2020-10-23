/**
 * 刷新列表数据
 */
function refresh() {
    var url = "/source/DataSourceList";
    $.ajax({
        url: url,
        type: 'POST',
        success: function (data) {
            $(".card-body").html(data);
        }

    });
    //$('.card-body').load(url);

}

