let lastRow;
var currentId;

/**
 * 刷新列表数据
 */
function refresh() {
    var url = "/source/DataSourceList";
    $.ajax({
        url: url,
        type: 'GET',
        success: function (data) {
            $(".card-body").html(data);
        }

    });

}

function DblinkTest() {
    if (currentId === undefined || currentId == null || currentId === "") {
        alert("请先选中对应行");
    } else {
        var url = "/source/dbLinkTest?id=" + currentId;
        $.ajax({
            url: url,
            type: 'GET',
            async: false,
            success: function (result) {
                if (result === 'true') {
                    $.messager.alert("提示","连接测试成功!","info");
                    //alert("连接测试成功！");
                } else {
                    $.messager.alert("提示","连接测试失败!" + result + ",请检查数据源配置。","error");
                    //alert("连接测试失败！" + result + ",请检查数据源配置。");
                }
            }

        });
    }
}

function RowClick(e) {
    currentId = e.cells[0].textContent;
    if (lastRow) {
        lastRow.bgColor = "#fff";
    }
    lastRow = e;
    e.bgColor = "#e6e6f2";
}
