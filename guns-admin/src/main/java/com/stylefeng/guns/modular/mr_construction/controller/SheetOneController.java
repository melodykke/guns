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
 * 项目月报控制器
 *
 * @author fengshuonan
 * @Date 2018-04-23 17:22:35
 */
@Controller
@RequestMapping("/sheetOne")
public class SheetOneController extends BaseController {

    private String PREFIX = "/mr_construction/sheetOne/";

    @Autowired
    private ISheetOneService sheetOneService;

    /**
     * 跳转到项目月报首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "sheetOne.html";
    }

    /**
     * 跳转到添加项目月报
     */
    @RequestMapping("/sheetOne_add")
    public String sheetOneAdd() {
        return PREFIX + "sheetOne_add.html";
    }

    /**
     * 跳转到修改项目月报
     */
    @RequestMapping("/sheetOne_update/{sheetOneId}")
    public String sheetOneUpdate(@PathVariable Integer sheetOneId, Model model) {
        SheetOne sheetOne = sheetOneService.selectById(sheetOneId);
        model.addAttribute("item",sheetOne);
        LogObjectHolder.me().set(sheetOne);
        return PREFIX + "sheetOne_edit.html";
    }

    /**
     * 获取项目月报列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return sheetOneService.selectList(null);
    }

    /**
     * 新增项目月报
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(SheetOne sheetOne) {
        sheetOneService.insert(sheetOne);
        return SUCCESS_TIP;
    }

    /**
     * 删除项目月报
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer sheetOneId) {
        sheetOneService.deleteById(sheetOneId);
        return SUCCESS_TIP;
    }

    /**
     * 修改项目月报
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(SheetOne sheetOne) {
        sheetOneService.updateById(sheetOne);
        return SUCCESS_TIP;
    }

    /**
     * 项目月报详情
     */
    @RequestMapping(value = "/detail/{sheetOneId}")
    @ResponseBody
    public Object detail(@PathVariable("sheetOneId") Integer sheetOneId) {
        return sheetOneService.selectById(sheetOneId);
    }

    /**
     * 跳转到修改项目月报
     */
    @RequestMapping("/sheetOne_view_detail/{sheetOneId}")
    public String sheetOneViewDetail(@PathVariable Integer sheetOneId, Model model) {
        SheetOne sheetOne = sheetOneService.selectById(sheetOneId);
        model.addAttribute("item",sheetOne);
        LogObjectHolder.me().set(sheetOne);
        return PREFIX + "sheetOne_view_detail.html";
    }
}
