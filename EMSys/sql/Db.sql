use emsys;

-- 用户表
create table if not exists `user`
(
    `id` bigint not null auto_increment comment '主键id' primary key,
    `user_name` varchar(256) not null comment '用户名',
    `account` varchar(256) not null comment '账户名',
    `password` varchar(256) not null comment '密码',
    `phone` varchar(256) not null comment '联系电话',
    `depart_id` varchar(256) not null comment '所属部门id',
    `project_id` varchar(256) not null comment '所属项目id',
    `status` varchar(256) default '1' not null comment '用户状态（0-停用,1-启用）',
    `remark` varchar(256) null comment '备注',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
    ) comment '用户表';

insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('黎文博', '37251738', 'hz6', '15341924357', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('白文博', '193781674', 'rFv9', '15570352194', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('覃思远', '35479423', 'YV413', '17668982994', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('张鸿煊', '45284492', 'kHFr1', '17268647720', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('侯健柏', '55', 'asc2z', '14766500353', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('唐潇然', '2638574', 'YlQI', '15147725537', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('毛语堂', '88207918', '4i', '15069060005', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('孔瑾瑜', '113135', 'jR', '13083116315', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('陈乐驹', '5109', 'Mszo', '13459220292', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('周烨霖', '70704', 'YtS', '14782116995', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('许烨霖', '881175446', 'rzUtZ', '17867122768', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('覃晟睿', '728', 'i5Fq', '17077812567', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('郝文', '6', 'a4i', '17354358601', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('田明轩', '21', 'OiZv', '17149561038', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('程子涵', '88011345', '0G', '15761880673', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('刘思淼', '7471778', '1r', '15506711055', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('马思源', '13322853', 'vsU8A', '15161820377', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('魏懿轩', '107', 'e7C', '15132361774', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('金烨伟', '76', 't8yH2', '17053645141', '6');
insert into `user` (`user_name`, `account`, `password`, `phone`, `status`) values ('钟潇然', '5197510', 'J3Pw', '17772212243', '6');