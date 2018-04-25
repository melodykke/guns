/**
 * 项目月报管理初始化
 */
var SheetOne = {
    id: "SheetOneTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
SheetOne.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '第一表格名', field: 'title', visible: true, align: 'center', valign: 'middle'},
            {title: '工程名称', field: 'projectName', visible: true, align: 'center', valign: 'middle'},
            {title: '建设内容', field: 'constructionContent', visible: true, align: 'center', valign: 'middle'},
            {title: '月合计', field: 'monthTotalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成投资土建及金结', field: 'monthCivilCost', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成投资机电设备及安装', field: 'monthElectricalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '独立费用', field: 'monthIndependentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '移民、环境及水保', field: 'monthEnvironmentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '其他', field: 'monthOtherCost', visible: true, align: 'center', valign: 'middle'},
            {title: '年合计', field: 'yearTotalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '本年度累计完成投资土建及金结', field: 'yearCivilCost', visible: true, align: 'center', valign: 'middle'},
            {title: '本年度累计完成投资机电设备及安装', field: 'yearElectricalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '独立费用', field: 'yearIndependentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '移民、环境及水保', field: 'yearEnvironmentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '其他', field: 'yearOtherCost', visible: true, align: 'center', valign: 'middle'},
            {title: '至今合计', field: 'sofarTotalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '至今累计完成投资土建及金结', field: 'sofarCivilCost', visible: true, align: 'center', valign: 'middle'},
            {title: '至今累计完成投资机电设备及安装', field: 'sofarElectricalCost', visible: true, align: 'center', valign: 'middle'},
            {title: '独立费用', field: 'sofarIndependentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '移民、环境及水保', field: 'sofarEnvironmentCost', visible: true, align: 'center', valign: 'middle'},
            {title: '其他', field: 'sofarOtherCost', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成土石方明挖', field: 'monthEarthworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成土石方洞挖', field: 'monthHoleworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成土石方回填', field: 'monthEarthworkBackfill', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成砌石', field: 'monthMasonry', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成混凝土', field: 'monthConcrete', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成钢筋', field: 'monthRebar', visible: true, align: 'center', valign: 'middle'},
            {title: '本月完成灌浆', field: 'monthGrout', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成土石方明挖', field: 'yearEarthworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成土石方洞挖', field: 'yearHoleworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成土石方回填', field: 'yearEarthworkBackfill', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成砌石', field: 'yearMasonry', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成混凝土', field: 'yearConcrete', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成钢筋', field: 'yearRebar', visible: true, align: 'center', valign: 'middle'},
            {title: '年度完成灌浆', field: 'yearGrout', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成土石方明挖', field: 'sofarEarthworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成土石方洞挖', field: 'sofarHoleworkExcavation', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成土石方回填', field: 'sofarEarthworkBackfill', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成砌石', field: 'sofarMasonry', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成混凝土', field: 'sofarConcrete', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成钢筋', field: 'sofarRebar', visible: true, align: 'center', valign: 'middle'},
            {title: '至今完成灌浆', field: 'sofarGrout', visible: true, align: 'center', valign: 'middle'},
            {title: '劳动力投入（万工日）', field: 'laborForce', visible: true, align: 'center', valign: 'middle'},
            {title: '工程形象进度及节点工期', field: 'progress', visible: true, align: 'center', valign: 'middle'},
            {title: '存在的困难及问题', field: 'difficulty', visible: true, align: 'center', valign: 'middle'},
            {title: '采取的主要措施', field: 'measure', visible: true, align: 'center', valign: 'middle'},
            {title: '下一步建议', field: 'suggestion', visible: true, align: 'center', valign: 'middle'},
            {title: '其他', field: 'other', visible: true, align: 'center', valign: 'middle'},
            {title: '负责人', field: 'principal', visible: true, align: 'center', valign: 'middle'},
            {title: '填报人', field: 'informant', visible: true, align: 'center', valign: 'middle'},
            {title: '联系电话', field: 'telephone', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'createTime', visible: true, align: 'center', valign: 'middle'},
            {title: '修改时间', field: 'updateTime', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
SheetOne.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        SheetOne.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加项目月报
 */
SheetOne.openAddSheetOne = function () {
    var index = layer.open({
        type: 2,
        title: '添加项目月报',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/sheetOne/sheetOne_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看项目月报详情
 */
SheetOne.openSheetOneDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '项目月报详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/sheetOne/sheetOne_update/' + SheetOne.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除项目月报
 */
SheetOne.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/sheetOne/delete", function (data) {
            Feng.success("删除成功!");
            SheetOne.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("sheetOneId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询项目月报列表
 */
SheetOne.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    SheetOne.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = SheetOne.initColumn();
    var table = new BSTable(SheetOne.id, "/sheetOne/list", defaultColunms);
    table.setPaginationType("client");
    SheetOne.table = table.init();
});
