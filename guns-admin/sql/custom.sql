create table `mr_sheet_one` (
    `id` int not null AUTO_INCREMENT,
    `title` varchar(128) not null comment '第一表格名',
    `project_name` varchar(128) not null comment '工程名称',
    `construction_content` varchar(512) not null comment '建设内容',

    `month_civil_cost` decimal(10,2) default '0.00' comment '本月完成投资土建及金结',
    `month_electrical_cost` decimal(10,2) default '0.00' comment '本月完成投资机电设备及安装',
    `month_independent_cost` decimal(10,2) default '0.00' comment '独立费用',
    `month_environment_cost` decimal(10,2) default '0.00' comment '移民、环境及水保',
    `month_other_cost` decimal(10,2) default '0.00' comment '其他',

    `year_civil_cost` decimal(10,2) default '0.00' comment '本年度累计完成投资土建及金结',
    `year_electrical_cost` decimal(10,2) default '0.00' comment '本年度累计完成投资机电设备及安装',
    `year_independent_cost` decimal(10,2) default '0.00' comment '独立费用',
    `year_environment_cost` decimal(10,2) default '0.00' comment '移民、环境及水保',
    `year_other_cost` decimal(10,2) default '0.00' comment '其他',

    `sofar_civil_cost` decimal(10,2) default '0.00' comment '至今累计完成投资土建及金结',
    `sofar_electrical_cost` decimal(10,2) default '0.00' comment '至今累计完成投资机电设备及安装',
    `sofar_independent_cost` decimal(10,2) default '0.00' comment '独立费用',
    `sofar_environment_cost` decimal(10,2) default '0.00' comment '移民、环境及水保',
    `sofar_other_cost` decimal(10,2) default '0.00' comment '其他',

    `month_earthwork_excavation` decimal(10,3) default '0.000' comment '本月完成土石方明挖',
    `month_holework_excavation` decimal(10,3) default '0.000' comment '本月完成土石方洞挖',
    `month_earthwork_backfill` decimal(10,3) default '0.000' comment '本月完成土石方回填',
    `month_masonry` decimal(10,3) default '0.000' comment '本月完成砌石',
    `month_concrete` decimal(10,3) default '0.000' comment '本月完成混凝土',
    `month_rebar` decimal(10,3) default '0.000' comment '本月完成钢筋',
    `month_grout` decimal(10,3) default '0.000' comment '本月完成灌浆',

    `year_earthwork_excavation` decimal(10,3) default '0.000' comment '年度完成土石方明挖',
    `year_holework_excavation` decimal(10,3) default '0.000' comment '年度完成土石方洞挖',
    `year_earthwork_backfill` decimal(10,3) default '0.000' comment '年度完成土石方回填',
    `year_masonry` decimal(10,3) default '0.000' comment '年度完成砌石',
    `year_concrete` decimal(10,3) default '0.000' comment '年度完成混凝土',
    `year_rebar` decimal(10,3) default '0.000' comment '年度完成钢筋',
    `year_grout` decimal(10,3) default '0.000' comment '年度完成灌浆',

    `sofar_earthwork_excavation` decimal(10,3) default '0.000' comment '至今完成土石方明挖',
    `sofar_holework_excavation` decimal(10,3) default '0.000' comment '至今完成土石方洞挖',
    `sofar_earthwork_backfill` decimal(10,3) default '0.000' comment '至今完成土石方回填',
    `sofar_masonry` decimal(10,3) default '0.000' comment '至今完成砌石',
    `sofar_concrete` decimal(10,3) default '0.000' comment '至今完成混凝土',
    `sofar_rebar` decimal(10,3) default '0.000' comment '至今完成钢筋',
    `sofar_grout` decimal(10,3) default '0.000' comment '至今完成灌浆',

    `labor_force` decimal(10,4) default '0.000' comment '劳动力投入（万工日）',

    `progress` VARCHAR(1024) comment '工程形象进度及节点工期',
    `difficulty` VARCHAR(1024) comment '存在的困难及问题',
    `measure` VARCHAR(1024) comment '采取的主要措施',
    `suggestion` VARCHAR(1024) comment '下一步建议',
    `other` VARCHAR(1024) comment '其他',

    `principal` VARCHAR(32) not null comment '负责人',
    `informant` VARCHAR(32) not null comment '填报人',
    `telephone` VARCHAR(32) not null comment '联系电话',

    `create_time` timestamp not null default current_timestamp comment '创建时间',
    `update_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COMMENT='月报表sheet1';
