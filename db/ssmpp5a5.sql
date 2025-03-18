-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmpp5a5
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmpp5a5/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmpp5a5/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmpp5a5/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangdaka`
--

DROP TABLE IF EXISTS `jiankangdaka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangdaka` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `tiwen` varchar(200) DEFAULT NULL COMMENT '体温',
  `shentishifoubushi` varchar(200) DEFAULT NULL COMMENT '身体是否不适',
  `tiwenshifouzhengchang` varchar(200) DEFAULT NULL COMMENT '体温是否正常',
  `jiarenzhongshifouyourenquezhenxinguanfeiyan` varchar(200) DEFAULT NULL COMMENT '家人中是否有人确诊新冠肺炎',
  `beizhu` longtext COMMENT '备注',
  `dengjishijian` datetime DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611837968162 DEFAULT CHARSET=utf8 COMMENT='健康打卡';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangdaka`
--

LOCK TABLES `jiankangdaka` WRITE;
/*!40000 ALTER TABLE `jiankangdaka` DISABLE KEYS */;
INSERT INTO `jiankangdaka` VALUES (31,'2021-01-28 12:40:01','用户账号1','用户姓名1','体温1','是','是','是','备注1','2021-01-28 20:40:01'),(32,'2021-01-28 12:40:01','用户账号2','用户姓名2','体温2','是','是','是','备注2','2021-01-28 20:40:01'),(33,'2021-01-28 12:40:01','用户账号3','用户姓名3','体温3','是','是','是','备注3','2021-01-28 20:40:01'),(34,'2021-01-28 12:40:01','用户账号4','用户姓名4','体温4','是','是','是','备注4','2021-01-28 20:40:01'),(35,'2021-01-28 12:40:01','用户账号5','用户姓名5','体温5','是','是','是','备注5','2021-01-28 20:40:01'),(36,'2021-01-28 12:40:01','用户账号6','用户姓名6','体温6','是','是','是','备注6','2021-01-28 20:40:01'),(1611837968161,'2021-01-28 12:46:07','125','胡月','36.8','否','是','否','无','2021-01-28 20:52:48');
/*!40000 ALTER TABLE `jiankangdaka` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `richangxuqiu`
--

DROP TABLE IF EXISTS `richangxuqiu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `richangxuqiu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `jialichengyuanrenshu` int(11) DEFAULT NULL COMMENT '家里成员人数',
  `xuqiuxiangxi` longtext COMMENT '需求详细',
  `tijiaoshijian` datetime DEFAULT NULL COMMENT '提交时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1611837981177 DEFAULT CHARSET=utf8 COMMENT='日常需求';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `richangxuqiu`
--

LOCK TABLES `richangxuqiu` WRITE;
/*!40000 ALTER TABLE `richangxuqiu` DISABLE KEYS */;
INSERT INTO `richangxuqiu` VALUES (41,'2021-01-28 12:40:01','用户账号1','用户姓名1','家庭住址1',1,'需求详细1','2021-01-28 20:40:01','是',''),(42,'2021-01-28 12:40:01','用户账号2','用户姓名2','家庭住址2',2,'需求详细2','2021-01-28 20:40:01','是',''),(43,'2021-01-28 12:40:01','用户账号3','用户姓名3','家庭住址3',3,'需求详细3','2021-01-28 20:40:01','是',''),(44,'2021-01-28 12:40:01','用户账号4','用户姓名4','家庭住址4',4,'需求详细4','2021-01-28 20:40:01','是',''),(45,'2021-01-28 12:40:01','用户账号5','用户姓名5','家庭住址5',5,'需求详细5','2021-01-28 20:40:01','是',''),(46,'2021-01-28 12:40:01','用户账号6','用户姓名6','家庭住址6',6,'需求详细6','2021-01-28 20:40:01','是',''),(1611837981176,'2021-01-28 12:46:20','125','胡月','北京花语',5,'大米','2021-01-30 00:00:00','是','11');
/*!40000 ALTER TABLE `richangxuqiu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shequrenyuan`
--

DROP TABLE IF EXISTS `shequrenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shequrenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shequzhanghao` varchar(200) NOT NULL COMMENT '社区账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `jiatingdizhi` varchar(200) DEFAULT NULL COMMENT '家庭地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shequzhanghao` (`shequzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1611837921987 DEFAULT CHARSET=utf8 COMMENT='社区人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shequrenyuan`
--

LOCK TABLES `shequrenyuan` WRITE;
/*!40000 ALTER TABLE `shequrenyuan` DISABLE KEYS */;
INSERT INTO `shequrenyuan` VALUES (21,'2021-01-28 12:40:01','社区人员1','姓名1','123456','男','年龄1','职务1','13823888881','440300199101010001','家庭地址1'),(22,'2021-01-28 12:40:01','社区人员2','姓名2','123456','男','年龄2','职务2','13823888882','440300199202020002','家庭地址2'),(23,'2021-01-28 12:40:01','社区人员3','姓名3','123456','男','年龄3','职务3','13823888883','440300199303030003','家庭地址3'),(24,'2021-01-28 12:40:01','社区人员4','姓名4','123456','男','年龄4','职务4','13823888884','440300199404040004','家庭地址4'),(25,'2021-01-28 12:40:01','社区人员5','姓名5','123456','男','年龄5','职务5','13823888885','440300199505050005','家庭地址5'),(26,'2021-01-28 12:40:01','社区人员6','姓名6','123456','男','年龄6','职务6','13823888886','440300199606060006','家庭地址6'),(1611837921986,'2021-01-28 12:45:21','456','顾红','456','男','36','主任','13613613522','123123123123123123','毕竟华语');
/*!40000 ALTER TABLE `shequrenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','llikso4e72l8149c5gq7julacovt3d59','2021-01-28 12:43:57','2021-01-28 13:47:41'),(2,1611837884316,'125','yonghu','用户','123ffo7voubabemqnchxn9f4rrlf7vn6','2021-01-28 12:45:35','2021-01-28 13:48:14'),(3,1611837921986,'456','shequrenyuan','社区人员','4tz8zoxb5oyqago3ibvs1jaw1l33zt7v','2021-01-28 12:46:46','2021-01-28 13:46:47');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-01-28 12:40:01');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yijianlan`
--

DROP TABLE IF EXISTS `yijianlan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yijianlan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `jianyifankui` longtext COMMENT '建议反馈',
  `tijiaoshijian` datetime DEFAULT NULL COMMENT '提交时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1611837997995 DEFAULT CHARSET=utf8 COMMENT='意见栏';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yijianlan`
--

LOCK TABLES `yijianlan` WRITE;
/*!40000 ALTER TABLE `yijianlan` DISABLE KEYS */;
INSERT INTO `yijianlan` VALUES (51,'2021-01-28 12:40:01','编号1','用户账号1','用户姓名1','建议反馈1','2021-01-28 20:40:01','是',''),(52,'2021-01-28 12:40:01','编号2','用户账号2','用户姓名2','建议反馈2','2021-01-28 20:40:01','是',''),(53,'2021-01-28 12:40:01','编号3','用户账号3','用户姓名3','建议反馈3','2021-01-28 20:40:01','是',''),(54,'2021-01-28 12:40:01','编号4','用户账号4','用户姓名4','建议反馈4','2021-01-28 20:40:01','是',''),(55,'2021-01-28 12:40:01','编号5','用户账号5','用户姓名5','建议反馈5','2021-01-28 20:40:01','是',''),(56,'2021-01-28 12:40:01','编号6','用户账号6','用户姓名6','建议反馈6','2021-01-28 20:40:01','是',''),(1611837997994,'2021-01-28 12:46:37','1611838396175','125','胡月','1205房有人咳嗽','2021-01-28 20:53:18','是','收到');
/*!40000 ALTER TABLE `yijianlan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `jiguan` varchar(200) DEFAULT NULL COMMENT '籍贯',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `dianziyouxiang` varchar(200) DEFAULT NULL COMMENT '电子邮箱',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1611837884317 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-01-28 12:40:01','用户1','用户姓名1','123456','籍贯1','男',1,'13823888881','773890001@qq.com','家庭住址1'),(12,'2021-01-28 12:40:01','用户2','用户姓名2','123456','籍贯2','男',2,'13823888882','773890002@qq.com','家庭住址2'),(13,'2021-01-28 12:40:01','用户3','用户姓名3','123456','籍贯3','男',3,'13823888883','773890003@qq.com','家庭住址3'),(14,'2021-01-28 12:40:01','用户4','用户姓名4','123456','籍贯4','男',4,'13823888884','773890004@qq.com','家庭住址4'),(15,'2021-01-28 12:40:01','用户5','用户姓名5','123456','籍贯5','男',5,'13823888885','773890005@qq.com','家庭住址5'),(16,'2021-01-28 12:40:01','用户6','用户姓名6','123456','籍贯6','男',6,'13823888886','773890006@qq.com','家庭住址6'),(1611837884316,'2021-01-28 12:44:44','125','胡月','125','广东','女',32,'13613613635','1545454@qq.com','北京花语');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-01 14:38:53
