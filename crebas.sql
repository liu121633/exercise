/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018-03-23 14:20:23                          */
/*==============================================================*/


drop table if exists prod_host;

drop table if exists tbl_market_output;

drop table if exists tbl_market_output_credit;

drop table if exists tbl_market_output_detail;

drop table if exists tbl_market_output_remark;

drop table if exists tbl_prod_class;

drop table if exists 物料基本资料;

drop table if exists 物料存量总信息;

drop table if exists 物料描述;

/*==============================================================*/
/* Table: prod_host                                             */
/*==============================================================*/
create table prod_host
(
   prod_id              varchar(100) not null comment '物料编号',
   prod_class_id        varchar(100) comment '物料类别编号',
   prod_name            varchar(255) comment '物料名称',
   std_unit_id          varchar(255) comment '计量单位',
   prod_size            varchar(255) comment '规格型号',
   bar_code_id          varchar(255) comment '条形码编号',
   eng_name             varchar(255) comment '英文品名',
   primary key (prod_id)
);

/*==============================================================*/
/* Table: tbl_market_output                                     */
/*==============================================================*/
create table tbl_market_output
(
   tbl_market_output_no varchar(100) not null comment '销售出库单单据号码',
   cust_id              varchar(100) comment '客户编号',
   tbl_market_output_date date comment '单据日期',
   addr_id              varchar(255) comment '送货地址',
   sale_class_id        varchar(100) comment '销售出库类型',
   prod_price_of_tax    bool comment '单价是否含税',
   exch_rate            decimal(50,0) comment '汇率',
   ware_id              varchar(100) comment '仓库',
   has_foreign_trade    bool comment '国外贸易',
   sales_id             varchar(100) comment '业务人员',
   maker                varchar(100) comment '制单人员',
   depart_id            varchar(100) comment '所属部门',
   permitter            varchar(100) comment '复核人员',
   project_id           varchar(100) comment '所属项目',
   tbl_market_output_state bool comment '状态',
   amount_remaining     decimal(50,2),
   aggregate_amount     decimal(50,2),
   primary key (tbl_market_output_no)
);

/*==============================================================*/
/* Table: tbl_market_output_credit                              */
/*==============================================================*/
create table tbl_market_output_credit
(
   tbl_market_output_no varchar(100) comment '销售出库单单据号码',
   credit_due_to        varchar(100) comment '销售出库单账款归属客户',
   credit_prepay_day    date comment '销售出库单_账款收款日期',
   credit_gather_style  int comment '销售出库单_账款收款条件类型',
   credit_gather_delay  int comment '销售出库单_账款收款条件',
   credit_acc_month     date comment '销售出库单_账款账款月份'
);

/*==============================================================*/
/* Table: tbl_market_output_detail                              */
/*==============================================================*/
create table tbl_market_output_detail
(
   tbl_market_output_no varchar(100) comment '销售出库单单据号码',
   line_no              int comment '行号',
   prod_id              varchar(100) comment '物料编号',
   quantity             decimal(50,0) comment '数量',
   old_price            decimal(50,2) comment '折扣前单价',
   descount             int comment '折数',
   price                decimal(50,2) comment '单价',
   amount               decimal(50,2) comment '金额',
   taxrate              int comment '税率',
   tax_amt              decimal(50,2) comment '税额',
   item_remark          varchar(255) comment '分录备注',
   tran_type            varchar(100) comment '来源单别',
   from_no              varchar(100) comment '来源单号',
   cust_bill_no         varchar(100) comment '客户订单'
);

/*==============================================================*/
/* Table: tbl_market_output_remark                              */
/*==============================================================*/
create table tbl_market_output_remark
(
   tbl_market_output_no varchar(100) comment '销售出库单单据号码',
   udef1                varchar(255),
   udef2                varchar(255),
   remark               varchar(5000)
);

/*==============================================================*/
/* Table: tbl_prod_class                                        */
/*==============================================================*/
create table tbl_prod_class
(
   prod_class_id        varchar(100) not null comment '物料类别编号',
   prod_class_name      varchar(255) comment '物料类别名称',
   prod_class_eng_name  varchar(255) comment '物料类别英文名称',
   primary key (prod_class_id)
);

/*==============================================================*/
/* Table: 物料基本资料                                                */
/*==============================================================*/
create table 物料基本资料
(
   prod_id              varchar(100) comment '物料编号',
   sugges_price         decimal(50,0) comment '物料建议售价',
   prod_curr            varchar(100) comment '物料使用币别',
   prod_form            varchar(100) comment '物料物料型态',
   prod_price_of_tax    bool comment '物料单价是否含税',
   prod_tax_items       varchar(100) comment '物料税目',
   prod_busi_tax_rate   int comment '物料税率',
   prod_advance_days    int comment '物料采购提前期',
   major_supplier       varchar(100) comment '物料主供应商',
   prod_std_price       decimal(50,2) comment '物料标准进价'
);

/*==============================================================*/
/* Table: 物料存量总信息                                               */
/*==============================================================*/
create table 物料存量总信息
(
   prod_id              varchar(100) comment '物料编号',
   b_safe_all_stk       decimal(50,0) comment '安全存量',
   b_all_amt            decimal(50,0) comment '期初总数量',
   b_avg_cost           decimal(50,2) comment '平均成本',
   b_std_cost           decimal(50,2) comment '标准成本',
   b_all_cost           decimal(50,2) comment '期初总成本',
   c_safe_all_stk       decimal(50) comment '低于安全存量',
   c_all_amt            decimal(50) comment '现有总数量',
   c_avg_cost           decimal(50,2) comment '现行平均成本',
   c_std_cost           decimal(50,2) comment '标准总成本',
   c_all_cost           decimal(50,2) comment '现行总成本'
);

/*==============================================================*/
/* Table: 物料描述                                                  */
/*==============================================================*/
create table 物料描述
(
   prod_id              varchar(100) comment '物料编号',
   prod_udef1           varchar(255) comment '物料自定义栏一',
   prod_udef2           varchar(255) comment '物料自定义栏二',
   prod_desc            varchar(5000) comment '物料说明'
);

alter table prod_host add constraint FK_Reference_1 foreign key (prod_class_id)
      references tbl_prod_class (prod_class_id) on delete restrict on update restrict;

alter table tbl_market_output_credit add constraint FK_Reference_5 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table tbl_market_output_detail add constraint FK_Reference_7 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table tbl_market_output_remark add constraint FK_Reference_6 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table 物料基本资料 add constraint FK_Reference_3 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

alter table 物料存量总信息 add constraint FK_Reference_4 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

alter table 物料描述 add constraint FK_Reference_2 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

