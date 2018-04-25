package com.stylefeng.guns.modular.system.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 月报表sheet1
 * </p>
 *
 * @author melodykke123
 * @since 2018-04-23
 */
@TableName("mr_sheet_one")
public class SheetOne extends Model<SheetOne> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 第一表格名
     */
    private String title;
    /**
     * 工程名称
     */
    @TableField("project_name")
    private String projectName;
    /**
     * 建设内容
     */
    @TableField("construction_content")
    private String constructionContent;
    /**
     * 月合计
     */
    @TableField("month_total_cost")
    private BigDecimal monthTotalCost;
    /**
     * 本月完成投资土建及金结
     */
    @TableField("month_civil_cost")
    private BigDecimal monthCivilCost;
    /**
     * 本月完成投资机电设备及安装
     */
    @TableField("month_electrical_cost")
    private BigDecimal monthElectricalCost;
    /**
     * 独立费用
     */
    @TableField("month_independent_cost")
    private BigDecimal monthIndependentCost;
    /**
     * 移民、环境及水保
     */
    @TableField("month_environment_cost")
    private BigDecimal monthEnvironmentCost;
    /**
     * 其他
     */
    @TableField("month_other_cost")
    private BigDecimal monthOtherCost;
    /**
     * 年合计
     */
    @TableField("year_total_cost")
    private BigDecimal yearTotalCost;
    /**
     * 本年度累计完成投资土建及金结
     */
    @TableField("year_civil_cost")
    private BigDecimal yearCivilCost;
    /**
     * 本年度累计完成投资机电设备及安装
     */
    @TableField("year_electrical_cost")
    private BigDecimal yearElectricalCost;
    /**
     * 独立费用
     */
    @TableField("year_independent_cost")
    private BigDecimal yearIndependentCost;
    /**
     * 移民、环境及水保
     */
    @TableField("year_environment_cost")
    private BigDecimal yearEnvironmentCost;
    /**
     * 其他
     */
    @TableField("year_other_cost")
    private BigDecimal yearOtherCost;
    /**
     * 至今合计
     */
    @TableField("sofar_total_cost")
    private BigDecimal sofarTotalCost;
    /**
     * 至今累计完成投资土建及金结
     */
    @TableField("sofar_civil_cost")
    private BigDecimal sofarCivilCost;
    /**
     * 至今累计完成投资机电设备及安装
     */
    @TableField("sofar_electrical_cost")
    private BigDecimal sofarElectricalCost;
    /**
     * 独立费用
     */
    @TableField("sofar_independent_cost")
    private BigDecimal sofarIndependentCost;
    /**
     * 移民、环境及水保
     */
    @TableField("sofar_environment_cost")
    private BigDecimal sofarEnvironmentCost;
    /**
     * 其他
     */
    @TableField("sofar_other_cost")
    private BigDecimal sofarOtherCost;
    /**
     * 本月完成土石方明挖
     */
    @TableField("month_earthwork_excavation")
    private BigDecimal monthEarthworkExcavation;
    /**
     * 本月完成土石方洞挖
     */
    @TableField("month_holework_excavation")
    private BigDecimal monthHoleworkExcavation;
    /**
     * 本月完成土石方回填
     */
    @TableField("month_earthwork_backfill")
    private BigDecimal monthEarthworkBackfill;
    /**
     * 本月完成砌石
     */
    @TableField("month_masonry")
    private BigDecimal monthMasonry;
    /**
     * 本月完成混凝土
     */
    @TableField("month_concrete")
    private BigDecimal monthConcrete;
    /**
     * 本月完成钢筋
     */
    @TableField("month_rebar")
    private BigDecimal monthRebar;
    /**
     * 本月完成灌浆
     */
    @TableField("month_grout")
    private BigDecimal monthGrout;
    /**
     * 年度完成土石方明挖
     */
    @TableField("year_earthwork_excavation")
    private BigDecimal yearEarthworkExcavation;
    /**
     * 年度完成土石方洞挖
     */
    @TableField("year_holework_excavation")
    private BigDecimal yearHoleworkExcavation;
    /**
     * 年度完成土石方回填
     */
    @TableField("year_earthwork_backfill")
    private BigDecimal yearEarthworkBackfill;
    /**
     * 年度完成砌石
     */
    @TableField("year_masonry")
    private BigDecimal yearMasonry;
    /**
     * 年度完成混凝土
     */
    @TableField("year_concrete")
    private BigDecimal yearConcrete;
    /**
     * 年度完成钢筋
     */
    @TableField("year_rebar")
    private BigDecimal yearRebar;
    /**
     * 年度完成灌浆
     */
    @TableField("year_grout")
    private BigDecimal yearGrout;
    /**
     * 至今完成土石方明挖
     */
    @TableField("sofar_earthwork_excavation")
    private BigDecimal sofarEarthworkExcavation;
    /**
     * 至今完成土石方洞挖
     */
    @TableField("sofar_holework_excavation")
    private BigDecimal sofarHoleworkExcavation;
    /**
     * 至今完成土石方回填
     */
    @TableField("sofar_earthwork_backfill")
    private BigDecimal sofarEarthworkBackfill;
    /**
     * 至今完成砌石
     */
    @TableField("sofar_masonry")
    private BigDecimal sofarMasonry;
    /**
     * 至今完成混凝土
     */
    @TableField("sofar_concrete")
    private BigDecimal sofarConcrete;
    /**
     * 至今完成钢筋
     */
    @TableField("sofar_rebar")
    private BigDecimal sofarRebar;
    /**
     * 至今完成灌浆
     */
    @TableField("sofar_grout")
    private BigDecimal sofarGrout;
    /**
     * 劳动力投入（万工日）
     */
    @TableField("labor_force")
    private BigDecimal laborForce;
    /**
     * 工程形象进度及节点工期
     */
    private String progress;
    /**
     * 存在的困难及问题
     */
    private String difficulty;
    /**
     * 采取的主要措施
     */
    private String measure;
    /**
     * 下一步建议
     */
    private String suggestion;
    /**
     * 其他
     */
    private String other;
    /**
     * 负责人
     */
    private String principal;
    /**
     * 填报人
     */
    private String informant;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getConstructionContent() {
        return constructionContent;
    }

    public void setConstructionContent(String constructionContent) {
        this.constructionContent = constructionContent;
    }

    public BigDecimal getMonthTotalCost() {
        return monthTotalCost;
    }

    public void setMonthTotalCost(BigDecimal monthTotalCost) {
        this.monthTotalCost = monthTotalCost;
    }

    public BigDecimal getMonthCivilCost() {
        return monthCivilCost;
    }

    public void setMonthCivilCost(BigDecimal monthCivilCost) {
        this.monthCivilCost = monthCivilCost;
    }

    public BigDecimal getMonthElectricalCost() {
        return monthElectricalCost;
    }

    public void setMonthElectricalCost(BigDecimal monthElectricalCost) {
        this.monthElectricalCost = monthElectricalCost;
    }

    public BigDecimal getMonthIndependentCost() {
        return monthIndependentCost;
    }

    public void setMonthIndependentCost(BigDecimal monthIndependentCost) {
        this.monthIndependentCost = monthIndependentCost;
    }

    public BigDecimal getMonthEnvironmentCost() {
        return monthEnvironmentCost;
    }

    public void setMonthEnvironmentCost(BigDecimal monthEnvironmentCost) {
        this.monthEnvironmentCost = monthEnvironmentCost;
    }

    public BigDecimal getMonthOtherCost() {
        return monthOtherCost;
    }

    public void setMonthOtherCost(BigDecimal monthOtherCost) {
        this.monthOtherCost = monthOtherCost;
    }

    public BigDecimal getYearTotalCost() {
        return yearTotalCost;
    }

    public void setYearTotalCost(BigDecimal yearTotalCost) {
        this.yearTotalCost = yearTotalCost;
    }

    public BigDecimal getYearCivilCost() {
        return yearCivilCost;
    }

    public void setYearCivilCost(BigDecimal yearCivilCost) {
        this.yearCivilCost = yearCivilCost;
    }

    public BigDecimal getYearElectricalCost() {
        return yearElectricalCost;
    }

    public void setYearElectricalCost(BigDecimal yearElectricalCost) {
        this.yearElectricalCost = yearElectricalCost;
    }

    public BigDecimal getYearIndependentCost() {
        return yearIndependentCost;
    }

    public void setYearIndependentCost(BigDecimal yearIndependentCost) {
        this.yearIndependentCost = yearIndependentCost;
    }

    public BigDecimal getYearEnvironmentCost() {
        return yearEnvironmentCost;
    }

    public void setYearEnvironmentCost(BigDecimal yearEnvironmentCost) {
        this.yearEnvironmentCost = yearEnvironmentCost;
    }

    public BigDecimal getYearOtherCost() {
        return yearOtherCost;
    }

    public void setYearOtherCost(BigDecimal yearOtherCost) {
        this.yearOtherCost = yearOtherCost;
    }

    public BigDecimal getSofarTotalCost() {
        return sofarTotalCost;
    }

    public void setSofarTotalCost(BigDecimal sofarTotalCost) {
        this.sofarTotalCost = sofarTotalCost;
    }

    public BigDecimal getSofarCivilCost() {
        return sofarCivilCost;
    }

    public void setSofarCivilCost(BigDecimal sofarCivilCost) {
        this.sofarCivilCost = sofarCivilCost;
    }

    public BigDecimal getSofarElectricalCost() {
        return sofarElectricalCost;
    }

    public void setSofarElectricalCost(BigDecimal sofarElectricalCost) {
        this.sofarElectricalCost = sofarElectricalCost;
    }

    public BigDecimal getSofarIndependentCost() {
        return sofarIndependentCost;
    }

    public void setSofarIndependentCost(BigDecimal sofarIndependentCost) {
        this.sofarIndependentCost = sofarIndependentCost;
    }

    public BigDecimal getSofarEnvironmentCost() {
        return sofarEnvironmentCost;
    }

    public void setSofarEnvironmentCost(BigDecimal sofarEnvironmentCost) {
        this.sofarEnvironmentCost = sofarEnvironmentCost;
    }

    public BigDecimal getSofarOtherCost() {
        return sofarOtherCost;
    }

    public void setSofarOtherCost(BigDecimal sofarOtherCost) {
        this.sofarOtherCost = sofarOtherCost;
    }

    public BigDecimal getMonthEarthworkExcavation() {
        return monthEarthworkExcavation;
    }

    public void setMonthEarthworkExcavation(BigDecimal monthEarthworkExcavation) {
        this.monthEarthworkExcavation = monthEarthworkExcavation;
    }

    public BigDecimal getMonthHoleworkExcavation() {
        return monthHoleworkExcavation;
    }

    public void setMonthHoleworkExcavation(BigDecimal monthHoleworkExcavation) {
        this.monthHoleworkExcavation = monthHoleworkExcavation;
    }

    public BigDecimal getMonthEarthworkBackfill() {
        return monthEarthworkBackfill;
    }

    public void setMonthEarthworkBackfill(BigDecimal monthEarthworkBackfill) {
        this.monthEarthworkBackfill = monthEarthworkBackfill;
    }

    public BigDecimal getMonthMasonry() {
        return monthMasonry;
    }

    public void setMonthMasonry(BigDecimal monthMasonry) {
        this.monthMasonry = monthMasonry;
    }

    public BigDecimal getMonthConcrete() {
        return monthConcrete;
    }

    public void setMonthConcrete(BigDecimal monthConcrete) {
        this.monthConcrete = monthConcrete;
    }

    public BigDecimal getMonthRebar() {
        return monthRebar;
    }

    public void setMonthRebar(BigDecimal monthRebar) {
        this.monthRebar = monthRebar;
    }

    public BigDecimal getMonthGrout() {
        return monthGrout;
    }

    public void setMonthGrout(BigDecimal monthGrout) {
        this.monthGrout = monthGrout;
    }

    public BigDecimal getYearEarthworkExcavation() {
        return yearEarthworkExcavation;
    }

    public void setYearEarthworkExcavation(BigDecimal yearEarthworkExcavation) {
        this.yearEarthworkExcavation = yearEarthworkExcavation;
    }

    public BigDecimal getYearHoleworkExcavation() {
        return yearHoleworkExcavation;
    }

    public void setYearHoleworkExcavation(BigDecimal yearHoleworkExcavation) {
        this.yearHoleworkExcavation = yearHoleworkExcavation;
    }

    public BigDecimal getYearEarthworkBackfill() {
        return yearEarthworkBackfill;
    }

    public void setYearEarthworkBackfill(BigDecimal yearEarthworkBackfill) {
        this.yearEarthworkBackfill = yearEarthworkBackfill;
    }

    public BigDecimal getYearMasonry() {
        return yearMasonry;
    }

    public void setYearMasonry(BigDecimal yearMasonry) {
        this.yearMasonry = yearMasonry;
    }

    public BigDecimal getYearConcrete() {
        return yearConcrete;
    }

    public void setYearConcrete(BigDecimal yearConcrete) {
        this.yearConcrete = yearConcrete;
    }

    public BigDecimal getYearRebar() {
        return yearRebar;
    }

    public void setYearRebar(BigDecimal yearRebar) {
        this.yearRebar = yearRebar;
    }

    public BigDecimal getYearGrout() {
        return yearGrout;
    }

    public void setYearGrout(BigDecimal yearGrout) {
        this.yearGrout = yearGrout;
    }

    public BigDecimal getSofarEarthworkExcavation() {
        return sofarEarthworkExcavation;
    }

    public void setSofarEarthworkExcavation(BigDecimal sofarEarthworkExcavation) {
        this.sofarEarthworkExcavation = sofarEarthworkExcavation;
    }

    public BigDecimal getSofarHoleworkExcavation() {
        return sofarHoleworkExcavation;
    }

    public void setSofarHoleworkExcavation(BigDecimal sofarHoleworkExcavation) {
        this.sofarHoleworkExcavation = sofarHoleworkExcavation;
    }

    public BigDecimal getSofarEarthworkBackfill() {
        return sofarEarthworkBackfill;
    }

    public void setSofarEarthworkBackfill(BigDecimal sofarEarthworkBackfill) {
        this.sofarEarthworkBackfill = sofarEarthworkBackfill;
    }

    public BigDecimal getSofarMasonry() {
        return sofarMasonry;
    }

    public void setSofarMasonry(BigDecimal sofarMasonry) {
        this.sofarMasonry = sofarMasonry;
    }

    public BigDecimal getSofarConcrete() {
        return sofarConcrete;
    }

    public void setSofarConcrete(BigDecimal sofarConcrete) {
        this.sofarConcrete = sofarConcrete;
    }

    public BigDecimal getSofarRebar() {
        return sofarRebar;
    }

    public void setSofarRebar(BigDecimal sofarRebar) {
        this.sofarRebar = sofarRebar;
    }

    public BigDecimal getSofarGrout() {
        return sofarGrout;
    }

    public void setSofarGrout(BigDecimal sofarGrout) {
        this.sofarGrout = sofarGrout;
    }

    public BigDecimal getLaborForce() {
        return laborForce;
    }

    public void setLaborForce(BigDecimal laborForce) {
        this.laborForce = laborForce;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getInformant() {
        return informant;
    }

    public void setInformant(String informant) {
        this.informant = informant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SheetOne{" +
        "id=" + id +
        ", title=" + title +
        ", projectName=" + projectName +
        ", constructionContent=" + constructionContent +
        ", monthTotalCost=" + monthTotalCost +
        ", monthCivilCost=" + monthCivilCost +
        ", monthElectricalCost=" + monthElectricalCost +
        ", monthIndependentCost=" + monthIndependentCost +
        ", monthEnvironmentCost=" + monthEnvironmentCost +
        ", monthOtherCost=" + monthOtherCost +
        ", yearTotalCost=" + yearTotalCost +
        ", yearCivilCost=" + yearCivilCost +
        ", yearElectricalCost=" + yearElectricalCost +
        ", yearIndependentCost=" + yearIndependentCost +
        ", yearEnvironmentCost=" + yearEnvironmentCost +
        ", yearOtherCost=" + yearOtherCost +
        ", sofarTotalCost=" + sofarTotalCost +
        ", sofarCivilCost=" + sofarCivilCost +
        ", sofarElectricalCost=" + sofarElectricalCost +
        ", sofarIndependentCost=" + sofarIndependentCost +
        ", sofarEnvironmentCost=" + sofarEnvironmentCost +
        ", sofarOtherCost=" + sofarOtherCost +
        ", monthEarthworkExcavation=" + monthEarthworkExcavation +
        ", monthHoleworkExcavation=" + monthHoleworkExcavation +
        ", monthEarthworkBackfill=" + monthEarthworkBackfill +
        ", monthMasonry=" + monthMasonry +
        ", monthConcrete=" + monthConcrete +
        ", monthRebar=" + monthRebar +
        ", monthGrout=" + monthGrout +
        ", yearEarthworkExcavation=" + yearEarthworkExcavation +
        ", yearHoleworkExcavation=" + yearHoleworkExcavation +
        ", yearEarthworkBackfill=" + yearEarthworkBackfill +
        ", yearMasonry=" + yearMasonry +
        ", yearConcrete=" + yearConcrete +
        ", yearRebar=" + yearRebar +
        ", yearGrout=" + yearGrout +
        ", sofarEarthworkExcavation=" + sofarEarthworkExcavation +
        ", sofarHoleworkExcavation=" + sofarHoleworkExcavation +
        ", sofarEarthworkBackfill=" + sofarEarthworkBackfill +
        ", sofarMasonry=" + sofarMasonry +
        ", sofarConcrete=" + sofarConcrete +
        ", sofarRebar=" + sofarRebar +
        ", sofarGrout=" + sofarGrout +
        ", laborForce=" + laborForce +
        ", progress=" + progress +
        ", difficulty=" + difficulty +
        ", measure=" + measure +
        ", suggestion=" + suggestion +
        ", other=" + other +
        ", principal=" + principal +
        ", informant=" + informant +
        ", telephone=" + telephone +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
