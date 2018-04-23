/**
 * 初始化建设信息报表详情对话框
 */
var SheetOneInfoDlg = {
    sheetOneInfoData : {}
};

/**
 * 清除数据
 */
SheetOneInfoDlg.clearData = function() {
    this.sheetOneInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SheetOneInfoDlg.set = function(key, val) {
    this.sheetOneInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
SheetOneInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
SheetOneInfoDlg.close = function() {
    parent.layer.close(window.parent.SheetOne.layerIndex);
}

/**
 * 收集数据
 */
SheetOneInfoDlg.collectData = function() {
    this
    .set('id')
    .set('title')
    .set('projectName')
    .set('constructionContent')
    .set('monthCivilCost')
    .set('monthElectricalCost')
    .set('monthIndependentCost')
    .set('monthEnvironmentCost')
    .set('monthOtherCost')
    .set('yearCivilCost')
    .set('yearElectricalCost')
    .set('yearIndependentCost')
    .set('yearEnvironmentCost')
    .set('yearOtherCost')
    .set('sofarCivilCost')
    .set('sofarElectricalCost')
    .set('sofarIndependentCost')
    .set('sofarEnvironmentCost')
    .set('sofarOtherCost')
    .set('monthEarthworkExcavation')
    .set('monthHoleworkExcavation')
    .set('monthEarthworkBackfill')
    .set('monthMasonry')
    .set('monthConcrete')
    .set('monthRebar')
    .set('monthGrout')
    .set('yearEarthworkExcavation')
    .set('yearHoleworkExcavation')
    .set('yearEarthworkBackfill')
    .set('yearMasonry')
    .set('yearConcrete')
    .set('yearRebar')
    .set('yearGrout')
    .set('sofarEarthworkExcavation')
    .set('sofarHoleworkExcavation')
    .set('sofarEarthworkBackfill')
    .set('sofarMasonry')
    .set('sofarConcrete')
    .set('sofarRebar')
    .set('sofarGrout')
    .set('laborForce')
    .set('progress')
    .set('difficulty')
    .set('measure')
    .set('suggestion')
    .set('other')
    .set('principal')
    .set('informant')
    .set('telephone')
    .set('createTime')
    .set('updateTime');
}

/**
 * 提交添加
 */
SheetOneInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sheetOne/add", function(data){
        Feng.success("添加成功!");
        window.parent.SheetOne.table.refresh();
        SheetOneInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sheetOneInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
SheetOneInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/sheetOne/update", function(data){
        Feng.success("修改成功!");
        window.parent.SheetOne.table.refresh();
        SheetOneInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.sheetOneInfoData);
    ajax.start();
}

$(function() {

});
