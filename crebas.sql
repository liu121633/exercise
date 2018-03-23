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

drop table if exists ���ϻ�������;

drop table if exists ���ϴ�������Ϣ;

drop table if exists ��������;

/*==============================================================*/
/* Table: prod_host                                             */
/*==============================================================*/
create table prod_host
(
   prod_id              varchar(100) not null comment '���ϱ��',
   prod_class_id        varchar(100) comment '���������',
   prod_name            varchar(255) comment '��������',
   std_unit_id          varchar(255) comment '������λ',
   prod_size            varchar(255) comment '����ͺ�',
   bar_code_id          varchar(255) comment '��������',
   eng_name             varchar(255) comment 'Ӣ��Ʒ��',
   primary key (prod_id)
);

/*==============================================================*/
/* Table: tbl_market_output                                     */
/*==============================================================*/
create table tbl_market_output
(
   tbl_market_output_no varchar(100) not null comment '���۳��ⵥ���ݺ���',
   cust_id              varchar(100) comment '�ͻ����',
   tbl_market_output_date date comment '��������',
   addr_id              varchar(255) comment '�ͻ���ַ',
   sale_class_id        varchar(100) comment '���۳�������',
   prod_price_of_tax    bool comment '�����Ƿ�˰',
   exch_rate            decimal(50,0) comment '����',
   ware_id              varchar(100) comment '�ֿ�',
   has_foreign_trade    bool comment '����ó��',
   sales_id             varchar(100) comment 'ҵ����Ա',
   maker                varchar(100) comment '�Ƶ���Ա',
   depart_id            varchar(100) comment '��������',
   permitter            varchar(100) comment '������Ա',
   project_id           varchar(100) comment '������Ŀ',
   tbl_market_output_state bool comment '״̬',
   amount_remaining     decimal(50,2),
   aggregate_amount     decimal(50,2),
   primary key (tbl_market_output_no)
);

/*==============================================================*/
/* Table: tbl_market_output_credit                              */
/*==============================================================*/
create table tbl_market_output_credit
(
   tbl_market_output_no varchar(100) comment '���۳��ⵥ���ݺ���',
   credit_due_to        varchar(100) comment '���۳��ⵥ�˿�����ͻ�',
   credit_prepay_day    date comment '���۳��ⵥ_�˿��տ�����',
   credit_gather_style  int comment '���۳��ⵥ_�˿��տ���������',
   credit_gather_delay  int comment '���۳��ⵥ_�˿��տ�����',
   credit_acc_month     date comment '���۳��ⵥ_�˿��˿��·�'
);

/*==============================================================*/
/* Table: tbl_market_output_detail                              */
/*==============================================================*/
create table tbl_market_output_detail
(
   tbl_market_output_no varchar(100) comment '���۳��ⵥ���ݺ���',
   line_no              int comment '�к�',
   prod_id              varchar(100) comment '���ϱ��',
   quantity             decimal(50,0) comment '����',
   old_price            decimal(50,2) comment '�ۿ�ǰ����',
   descount             int comment '����',
   price                decimal(50,2) comment '����',
   amount               decimal(50,2) comment '���',
   taxrate              int comment '˰��',
   tax_amt              decimal(50,2) comment '˰��',
   item_remark          varchar(255) comment '��¼��ע',
   tran_type            varchar(100) comment '��Դ����',
   from_no              varchar(100) comment '��Դ����',
   cust_bill_no         varchar(100) comment '�ͻ�����'
);

/*==============================================================*/
/* Table: tbl_market_output_remark                              */
/*==============================================================*/
create table tbl_market_output_remark
(
   tbl_market_output_no varchar(100) comment '���۳��ⵥ���ݺ���',
   udef1                varchar(255),
   udef2                varchar(255),
   remark               varchar(5000)
);

/*==============================================================*/
/* Table: tbl_prod_class                                        */
/*==============================================================*/
create table tbl_prod_class
(
   prod_class_id        varchar(100) not null comment '���������',
   prod_class_name      varchar(255) comment '�����������',
   prod_class_eng_name  varchar(255) comment '�������Ӣ������',
   primary key (prod_class_id)
);

/*==============================================================*/
/* Table: ���ϻ�������                                                */
/*==============================================================*/
create table ���ϻ�������
(
   prod_id              varchar(100) comment '���ϱ��',
   sugges_price         decimal(50,0) comment '���Ͻ����ۼ�',
   prod_curr            varchar(100) comment '����ʹ�ñұ�',
   prod_form            varchar(100) comment '����������̬',
   prod_price_of_tax    bool comment '���ϵ����Ƿ�˰',
   prod_tax_items       varchar(100) comment '����˰Ŀ',
   prod_busi_tax_rate   int comment '����˰��',
   prod_advance_days    int comment '���ϲɹ���ǰ��',
   major_supplier       varchar(100) comment '��������Ӧ��',
   prod_std_price       decimal(50,2) comment '���ϱ�׼����'
);

/*==============================================================*/
/* Table: ���ϴ�������Ϣ                                               */
/*==============================================================*/
create table ���ϴ�������Ϣ
(
   prod_id              varchar(100) comment '���ϱ��',
   b_safe_all_stk       decimal(50,0) comment '��ȫ����',
   b_all_amt            decimal(50,0) comment '�ڳ�������',
   b_avg_cost           decimal(50,2) comment 'ƽ���ɱ�',
   b_std_cost           decimal(50,2) comment '��׼�ɱ�',
   b_all_cost           decimal(50,2) comment '�ڳ��ܳɱ�',
   c_safe_all_stk       decimal(50) comment '���ڰ�ȫ����',
   c_all_amt            decimal(50) comment '����������',
   c_avg_cost           decimal(50,2) comment '����ƽ���ɱ�',
   c_std_cost           decimal(50,2) comment '��׼�ܳɱ�',
   c_all_cost           decimal(50,2) comment '�����ܳɱ�'
);

/*==============================================================*/
/* Table: ��������                                                  */
/*==============================================================*/
create table ��������
(
   prod_id              varchar(100) comment '���ϱ��',
   prod_udef1           varchar(255) comment '�����Զ�����һ',
   prod_udef2           varchar(255) comment '�����Զ�������',
   prod_desc            varchar(5000) comment '����˵��'
);

alter table prod_host add constraint FK_Reference_1 foreign key (prod_class_id)
      references tbl_prod_class (prod_class_id) on delete restrict on update restrict;

alter table tbl_market_output_credit add constraint FK_Reference_5 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table tbl_market_output_detail add constraint FK_Reference_7 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table tbl_market_output_remark add constraint FK_Reference_6 foreign key (tbl_market_output_no)
      references tbl_market_output (tbl_market_output_no) on delete restrict on update restrict;

alter table ���ϻ������� add constraint FK_Reference_3 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

alter table ���ϴ�������Ϣ add constraint FK_Reference_4 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

alter table �������� add constraint FK_Reference_2 foreign key (prod_id)
      references prod_host (prod_id) on delete restrict on update restrict;

