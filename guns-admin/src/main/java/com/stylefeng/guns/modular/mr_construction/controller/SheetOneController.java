package com.stylefeng.guns.modular.mr_construction.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.SheetOne;
import com.stylefeng.guns.modular.mr_construction.service.ISheetOneService;

/**
 * 建设信息报表控制器
 *
 * @author fengshuonan
 * @Date 2018-04-23 10:49:54
 */
@Controller
@RequestMapping("/sheetOne")
public class SheetOneController extends BaseController {

    private String PREFIX = "/mr_construction/sheetOne/";

    @Autowired
    private ISheetOneService sheetOneService;

    /**
     * 跳转到建设信息报表首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sheetOne.html";
    }

    /**
     * 跳转到添加建设信息报表
     */
    @RequestMapping("/sheetOne_add")
    public String sheetOneAdd() {
        return PREFIX + "sheetOne_add.html";
    }

    /**
     * 跳转到修改建设信息报表
     */
    @RequestMapping("/sheetOne_update/{sheetOneId}")
    public String sheetOneUpdate(@PathVariable Integer sheetOneId, Model model) {
        SheetOne sheetOne = sheetOneService.selectById(sheetOneId);
        model.addAttribute("item",sheetOne);
        LogObjectHolder.me().set(sheetOne);
        return PREFIX + "sheetOne_edit.html";
    }

    /**
     * 获取建设信息报表列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sheetOneService.selectList(null);
    }

    /**
     * 新增建设信息报表
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SheetOne sheetOne) {
        sheetOneService.insert(sheetOne);
        return SUCCESS_TIP;
    }

    /**
     * 删除建设信息报表
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sheetOneId) {
        sheetOneService.deleteById(sheetOneId);
        return SUCCESS_TIP;
    }

    /**
     * 修改建设信息报表
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SheetOne sheetOne) {
        sheetOneService.updateById(sheetOne);
        return SUCCESS_TIP;
    }

    /**
     * 建设信息报表详情
     */
    @RequestMapping(value = "/detail/{sheetOneId}")
    @ResponseBody
    public Object detail(@PathVariable("sheetOneId") Integer sheetOneId) {
        return sheetOneService.selectById(sheetOneId);
    }

    /**
     * 跳转到建设信息报表详情
     */
    @RequestMapping("/sheetOne_view_detail/{sheetOneId}")
    public String sheetOneViewDetail(@PathVariable Integer sheetOneId, Model model) {
        SheetOne sheetOne = sheetOneService.selectById(sheetOneId);
        model.addAttribute("item",sheetOne);
        LogObjectHolder.me().set(sheetOne);
        return PREFIX + "sheetOne_view_detail.html";
    }
}
