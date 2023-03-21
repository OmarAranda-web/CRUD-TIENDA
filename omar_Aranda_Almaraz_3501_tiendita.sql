/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : omar_tiendita

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 18/01/2022 22:04:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for omar_bitacora
-- ----------------------------
DROP TABLE IF EXISTS `omar_bitacora`;
CREATE TABLE `omar_bitacora`  (
  `OMAR_ID_BITACORA` bigint(20) NOT NULL AUTO_INCREMENT,
  `OMAR_USUARIO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_FECHA` datetime(0) NULL DEFAULT NULL,
  `OMAR_Nuevo` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_VIEJO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_TABLA` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_ACCION` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`OMAR_ID_BITACORA`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of omar_bitacora
-- ----------------------------
INSERT INTO `omar_bitacora` VALUES (1, 'root@localhost', '2021-12-09 08:43:54', '12,PEPSI,1', '', 'omar_marca', 'Insert');
INSERT INTO `omar_bitacora` VALUES (2, 'root@localhost', '2021-12-09 09:08:01', '12,PEPSIC,1', '12,PEPSI,1', 'omar_marca', 'UPDATE');
INSERT INTO `omar_bitacora` VALUES (3, 'root@localhost', '2021-12-09 09:17:33', '', '12,PEPSIC,1', 'omar_marca', 'DELETE');

-- ----------------------------
-- Table structure for omar_clientes
-- ----------------------------
DROP TABLE IF EXISTS `omar_clientes`;
CREATE TABLE `omar_clientes`  (
  `OMAR_RFC_CLIENTE` varchar(13) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_NOMBRE_CLIENTE` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_APELLIDO1_CLIENTE` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_APELLIDO2_CLIENTE` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_DIRECCION_CLIENTE` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_TELEFONO_CLIENTE` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_CURP_CLIENTE` varchar(18) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_EMAIL_CLIENTE` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`OMAR_RFC_CLIENTE`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_clientes
-- ----------------------------
INSERT INTO `omar_clientes` VALUES ('AAAI030405', 'Ian Alexander', 'Aranda', 'Almaraz', 'El Durazno de Cuautemoc, Jilotepec México', '7924586147', 'AAAI030405HMCRLNA3', 'ian_Alex_21@gmail.com');
INSERT INTO `omar_clientes` VALUES ('AAAO010602', 'Omar', 'Aranda', 'Almaraz', 'El Durazno de Cuautemoc, Jilotepec México', '5530168975', 'AAAO010602HMCRLMA6', 'AAAO010602HMCRLMA6');
INSERT INTO `omar_clientes` VALUES ('AAAV940203', 'Veronica', 'Aranda', 'Almaraz', 'El Durazno de Cuautemoc, Jilotepec México', '5596874125', 'AAAV940203MCRLJSG5', 'veroar_hi@gmail.com');
INSERT INTO `omar_clientes` VALUES ('AASA390403', 'Alberto', 'Sanchez', 'Alcantara', 'Canalejas, Jilotepec Estado de México', '5852472798', 'AASA390403HMCRNL04', 'beto03_03@gmail.com');
INSERT INTO `omar_clientes` VALUES ('CUHA030506', 'Ana', 'Hernandez', 'Cuauhtemoc', 'Canalejas, Jilotepec Estado de México', '5573642156', 'CUHA030506MMCRTV04', 'ana05_7@gmail.com');

-- ----------------------------
-- Table structure for omar_compra
-- ----------------------------
DROP TABLE IF EXISTS `omar_compra`;
CREATE TABLE `omar_compra`  (
  `OMAR_ID_COMPRA` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_FOLIO_TICKET_COMPRA` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CLAVE_PROVEEDOR` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_FECHA_HORA_COMPRA` datetime(0) NOT NULL,
  `OMAR_TOTAL_DE_COMPRA` float NOT NULL,
  PRIMARY KEY (`OMAR_ID_COMPRA`) USING BTREE,
  INDEX `OMAR_COMPRA_PROVEEDOR`(`OMAR_CLAVE_PROVEEDOR`) USING BTREE,
  CONSTRAINT `OMAR_COMPRA_PROVEEDOR` FOREIGN KEY (`OMAR_CLAVE_PROVEEDOR`) REFERENCES `omar_proveedor` (`OMAR_CLAVE_PROVEEDOR`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_compra
-- ----------------------------
INSERT INTO `omar_compra` VALUES (2, 'A0001', 'A5631', '2021-12-15 18:43:40', 750);
INSERT INTO `omar_compra` VALUES (3, 'A0002', 'A5632', '2021-12-15 18:44:13', 750);
INSERT INTO `omar_compra` VALUES (4, 'A0003', 'A5633', '2021-12-15 18:44:40', 800);
INSERT INTO `omar_compra` VALUES (5, 'A0004', 'A5631', '2021-12-15 18:45:09', 1100);
INSERT INTO `omar_compra` VALUES (6, 'A0005', 'A5640', '2021-12-15 18:46:14', 900);
INSERT INTO `omar_compra` VALUES (8, 'A0006', 'A5632', '2021-12-15 18:46:53', 2000);
INSERT INTO `omar_compra` VALUES (9, 'A0007', 'A5639', '2021-12-15 18:49:05', 500);
INSERT INTO `omar_compra` VALUES (10, 'A0008', 'A5645', '2021-12-15 18:49:31', 900);
INSERT INTO `omar_compra` VALUES (11, 'A0009', 'A5644', '2021-12-15 18:51:17', 950);
INSERT INTO `omar_compra` VALUES (12, 'A0010', 'AH637', '2021-12-15 18:52:34', 850);
INSERT INTO `omar_compra` VALUES (13, 'A0011', 'A5632', '2021-12-15 18:53:34', 1050);
INSERT INTO `omar_compra` VALUES (14, 'A0012', 'A5633', '2021-12-15 18:54:21', 777);
INSERT INTO `omar_compra` VALUES (15, 'A0013', 'A5634', '2021-12-15 18:54:52', 707);
INSERT INTO `omar_compra` VALUES (16, 'A0014', 'A5635', '2021-12-15 18:55:11', 707);
INSERT INTO `omar_compra` VALUES (17, 'A0015', 'A5636', '2021-12-15 18:56:58', 500);
INSERT INTO `omar_compra` VALUES (18, 'A0016', 'A5637', '2021-12-15 18:59:18', 900);
INSERT INTO `omar_compra` VALUES (19, 'A0017', 'A5638', '2021-12-15 18:59:48', 600);
INSERT INTO `omar_compra` VALUES (20, 'A0018', 'A5639', '2021-12-15 19:01:23', 1100);
INSERT INTO `omar_compra` VALUES (21, 'A0019', 'A5640', '2021-12-15 19:01:45', 1150);
INSERT INTO `omar_compra` VALUES (22, 'A0020', 'A5641', '2021-12-15 19:03:27', 820);
INSERT INTO `omar_compra` VALUES (23, 'A0021', 'A5642', '2021-12-15 19:05:49', 1420);
INSERT INTO `omar_compra` VALUES (24, 'A0022', 'A5643', '2021-12-15 19:07:55', 1230);
INSERT INTO `omar_compra` VALUES (25, 'A0023', 'A5644', '2021-12-15 19:09:09', 1030);
INSERT INTO `omar_compra` VALUES (26, 'A0024', 'A5645', '2021-12-15 19:09:28', 930);
INSERT INTO `omar_compra` VALUES (27, 'A0025', 'A5646', '2021-12-15 19:09:49', 930);

-- ----------------------------
-- Table structure for omar_detalle_compra
-- ----------------------------
DROP TABLE IF EXISTS `omar_detalle_compra`;
CREATE TABLE `omar_detalle_compra`  (
  `OMAR_ID_DC` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_ID_COMPRA` int(11) NOT NULL,
  `OMAR_CLAVE_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_PRECIO_COMPRA` float NOT NULL,
  `OMAR_CANTIDAD_COMPRA` float(11, 0) NOT NULL,
  PRIMARY KEY (`OMAR_ID_DC`) USING BTREE,
  INDEX `OMAR_DC_COMPRA`(`OMAR_ID_COMPRA`) USING BTREE,
  INDEX `OMAR_PRODUCTO_COMPRA`(`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  CONSTRAINT `OMAR_DC_COMPRA` FOREIGN KEY (`OMAR_ID_COMPRA`) REFERENCES `omar_compra` (`OMAR_ID_COMPRA`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `OMAR_PRODUCTO_COMPRA` FOREIGN KEY (`OMAR_CLAVE_PRODUCTO`) REFERENCES `omar_producto` (`OMAR_CLAVE_PRODUCTO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_detalle_compra
-- ----------------------------
INSERT INTO `omar_detalle_compra` VALUES (5, 2, '750100333612523', 750, 60);
INSERT INTO `omar_detalle_compra` VALUES (6, 3, '750105533322175', 750, 40);
INSERT INTO `omar_detalle_compra` VALUES (7, 4, '750101605008987', 750, 800);
INSERT INTO `omar_detalle_compra` VALUES (8, 5, '750105533322175', 800, 60);
INSERT INTO `omar_detalle_compra` VALUES (9, 6, '7509782660507654', 800, 60);
INSERT INTO `omar_detalle_compra` VALUES (10, 8, '750105533322175', 2000, 90);
INSERT INTO `omar_detalle_compra` VALUES (11, 9, '750101605430013', 500, 20);
INSERT INTO `omar_detalle_compra` VALUES (12, 10, '750181605076546', 900, 30);
INSERT INTO `omar_detalle_compra` VALUES (13, 11, '750890660507654', 950, 35);
INSERT INTO `omar_detalle_compra` VALUES (14, 12, '750101656459827', 850, 25);
INSERT INTO `omar_detalle_compra` VALUES (15, 13, '760505573322175', 1050, 100);
INSERT INTO `omar_detalle_compra` VALUES (16, 14, '750101605008987', 777, 33);
INSERT INTO `omar_detalle_compra` VALUES (17, 15, '750181605008966', 707, 32);
INSERT INTO `omar_detalle_compra` VALUES (18, 16, '7509723530507654', 707, 32);
INSERT INTO `omar_detalle_compra` VALUES (19, 17, '7589672353050766', 500, 23);
INSERT INTO `omar_detalle_compra` VALUES (20, 18, '750181605008658', 900, 40);
INSERT INTO `omar_detalle_compra` VALUES (21, 19, '750101605214001', 600, 26);
INSERT INTO `omar_detalle_compra` VALUES (22, 20, '750101605430013', 1100, 110);
INSERT INTO `omar_detalle_compra` VALUES (23, 21, '7509787530507654', 1150, 112);
INSERT INTO `omar_detalle_compra` VALUES (24, 22, '750004634991654', 820, 60);
INSERT INTO `omar_detalle_compra` VALUES (25, 23, '038000148009891', 1420, 100);
INSERT INTO `omar_detalle_compra` VALUES (26, 24, '750850660507654', 1230, 100);
INSERT INTO `omar_detalle_compra` VALUES (27, 25, '750890660507654', 1030, 100);
INSERT INTO `omar_detalle_compra` VALUES (28, 26, '750181605076546', 930, 90);
INSERT INTO `omar_detalle_compra` VALUES (29, 27, '750106921070597', 930, 85);

-- ----------------------------
-- Table structure for omar_detalle_venta
-- ----------------------------
DROP TABLE IF EXISTS `omar_detalle_venta`;
CREATE TABLE `omar_detalle_venta`  (
  `OMAR_ID_DV` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_FOLIO_VENTA` int(11) NOT NULL,
  `OMAR_CLAVE_PRODUCTO` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CANTIDAD_VENTA` float NOT NULL,
  `OMAR_PRECIO_VENTA` float NOT NULL,
  `OMAR_TOTAL_CP` float NOT NULL,
  `OMAR_DESECUENTO_VENTA` float NOT NULL,
  PRIMARY KEY (`OMAR_ID_DV`) USING BTREE,
  INDEX `OMAR_DV_VENTA`(`OMAR_FOLIO_VENTA`) USING BTREE,
  INDEX `OMAR_DV_PRODUCTO`(`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  CONSTRAINT `OMAR_DV_PRODUCTO` FOREIGN KEY (`OMAR_CLAVE_PRODUCTO`) REFERENCES `omar_producto` (`OMAR_CLAVE_PRODUCTO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `OMAR_DV_VENTA` FOREIGN KEY (`OMAR_FOLIO_VENTA`) REFERENCES `omar_venta` (`OMAR_FOLIO_VENTA`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_detalle_venta
-- ----------------------------
INSERT INTO `omar_detalle_venta` VALUES (8, 1, '760505573322175', 3, 100, 100, 0);
INSERT INTO `omar_detalle_venta` VALUES (9, 2, '038000148009891', 8, 80, 80, 0);
INSERT INTO `omar_detalle_venta` VALUES (10, 3, '750101656459827', 3, 30, 30, 0);
INSERT INTO `omar_detalle_venta` VALUES (11, 4, '750181605008658', 2, 40, 40, 0);
INSERT INTO `omar_detalle_venta` VALUES (12, 5, '7509723530507654', 2, 50, 50, 0);
INSERT INTO `omar_detalle_venta` VALUES (13, 6, '750181605008966', 3, 45, 45, 0);
INSERT INTO `omar_detalle_venta` VALUES (14, 7, '7509782660507654', 4, 60, 60, 0);
INSERT INTO `omar_detalle_venta` VALUES (15, 8, '038000148009891', 1, 10, 10, 0);
INSERT INTO `omar_detalle_venta` VALUES (16, 9, '750850660507654', 2, 24, 24, 0);
INSERT INTO `omar_detalle_venta` VALUES (17, 10, '750850660507654', 3, 36, 36, 0);
INSERT INTO `omar_detalle_venta` VALUES (18, 11, '7589672353050766', 2, 70, 70, 0);
INSERT INTO `omar_detalle_venta` VALUES (19, 12, '7509723530507654', 3, 80, 80, 0);
INSERT INTO `omar_detalle_venta` VALUES (20, 13, '760505573322175', 9, 100, 100, 0);
INSERT INTO `omar_detalle_venta` VALUES (21, 14, '750101605008796', 7, 70, 70, 0);
INSERT INTO `omar_detalle_venta` VALUES (22, 15, '7589672353050766', 2, 60, 60, 0);
INSERT INTO `omar_detalle_venta` VALUES (23, 16, '750101605430013', 15, 200, 200, 0);
INSERT INTO `omar_detalle_venta` VALUES (24, 17, '750890660507654', 8, 100, 100, 0);
INSERT INTO `omar_detalle_venta` VALUES (25, 18, '750181605076546', 27, 300, 300, 0);
INSERT INTO `omar_detalle_venta` VALUES (26, 19, '750004634991654', 17, 350, 350, 0);
INSERT INTO `omar_detalle_venta` VALUES (27, 20, '750105533322175', 10, 150, 150, 0);
INSERT INTO `omar_detalle_venta` VALUES (28, 21, '7509723530507654', 10, 250, 250, 0);
INSERT INTO `omar_detalle_venta` VALUES (29, 22, '7509787530507654', 5, 90, 90, 0);
INSERT INTO `omar_detalle_venta` VALUES (30, 23, '750101605008796', 8, 80, 80, 0);
INSERT INTO `omar_detalle_venta` VALUES (31, 24, '750101605214001', 2, 50, 50, 0);
INSERT INTO `omar_detalle_venta` VALUES (32, 25, '038000148009891', 4, 40, 40, 0);
INSERT INTO `omar_detalle_venta` VALUES (34, 30, '750101605214001', 5, 15, 75, 0);

-- ----------------------------
-- Table structure for omar_devolucion
-- ----------------------------
DROP TABLE IF EXISTS `omar_devolucion`;
CREATE TABLE `omar_devolucion`  (
  `OMAR_ID_DEVOLUCION` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_CLAVE_PRODUCTO` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CANTIDAD_DEVOLUCIONES` float NOT NULL,
  `OMAR_STATUS_DEVOLUCION` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_FECHA_DEVOLUCION` date NOT NULL,
  `OMAR_FECHA_LIM_DEVOLUCION` date NOT NULL,
  PRIMARY KEY (`OMAR_ID_DEVOLUCION`) USING BTREE,
  INDEX `OMAR_PRODUCTO_DEVOLUCION`(`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  CONSTRAINT `OMAR_PRODUCTO_DEVOLUCION` FOREIGN KEY (`OMAR_CLAVE_PRODUCTO`) REFERENCES `omar_producto` (`OMAR_CLAVE_PRODUCTO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_devolucion
-- ----------------------------
INSERT INTO `omar_devolucion` VALUES (1, '760505573322175', 1, '1', '2021-12-08', '2021-12-31');
INSERT INTO `omar_devolucion` VALUES (2, '760505573322175', 1, '1', '2021-12-08', '2021-12-31');
INSERT INTO `omar_devolucion` VALUES (3, '760505573322175', 1, '1', '2021-12-08', '2021-12-31');
INSERT INTO `omar_devolucion` VALUES (4, '750105533322175', 1, '1', '2021-12-08', '2021-12-31');
INSERT INTO `omar_devolucion` VALUES (5, '750105533322175', 1, '1', '2021-12-08', '2021-12-31');
INSERT INTO `omar_devolucion` VALUES (6, '750105533322175', 1, '1', '2021-12-08', '2021-12-31');

-- ----------------------------
-- Table structure for omar_familia
-- ----------------------------
DROP TABLE IF EXISTS `omar_familia`;
CREATE TABLE `omar_familia`  (
  `OMAR_ID_FAMILIA` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_DESCRIPCION_FAMILIA` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_STATUS_FAMILIA` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`OMAR_ID_FAMILIA`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_familia
-- ----------------------------
INSERT INTO `omar_familia` VALUES (1, 'MAPLES', '1');
INSERT INTO `omar_familia` VALUES (2, 'FRITURAS', '1');
INSERT INTO `omar_familia` VALUES (3, 'CONSERVAS', '1');
INSERT INTO `omar_familia` VALUES (4, 'CAFES', '1');
INSERT INTO `omar_familia` VALUES (5, 'COMPLEMENTOS ALIMENTICIOS', '1');
INSERT INTO `omar_familia` VALUES (7, 'Cereales', '1');
INSERT INTO `omar_familia` VALUES (8, 'Dulces', '1');
INSERT INTO `omar_familia` VALUES (9, 'Aceites', '1');
INSERT INTO `omar_familia` VALUES (10, 'Mermeladas', '1');
INSERT INTO `omar_familia` VALUES (11, 'Harinas', '1');
INSERT INTO `omar_familia` VALUES (12, 'Utensilios', '1');
INSERT INTO `omar_familia` VALUES (14, 'Lacteos13', '0');

-- ----------------------------
-- Table structure for omar_marca
-- ----------------------------
DROP TABLE IF EXISTS `omar_marca`;
CREATE TABLE `omar_marca`  (
  `OMAR_ID_MARCA` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_NOMBRE_MARCA` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_STATUS` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`OMAR_ID_MARCA`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 69 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_marca
-- ----------------------------
INSERT INTO `omar_marca` VALUES (1, 'CARLOTA', '1');
INSERT INTO `omar_marca` VALUES (2, 'SABRITAS', '1');
INSERT INTO `omar_marca` VALUES (3, 'LA COSTEÑA', '1');
INSERT INTO `omar_marca` VALUES (4, 'NESTLE', '1');
INSERT INTO `omar_marca` VALUES (5, 'GERBER', '1');
INSERT INTO `omar_marca` VALUES (11, 'MATEL', '1');
INSERT INTO `omar_marca` VALUES (15, 'GAMESA', '1');
INSERT INTO `omar_marca` VALUES (16, 'MARINELA', '1');
INSERT INTO `omar_marca` VALUES (17, 'La abejita de Alain', '1');
INSERT INTO `omar_marca` VALUES (18, 'Nutrioli', '1');
INSERT INTO `omar_marca` VALUES (19, 'Molinillo', '1');
INSERT INTO `omar_marca` VALUES (20, 'McCormick', '1');
INSERT INTO `omar_marca` VALUES (21, 'Del Monte', '1');
INSERT INTO `omar_marca` VALUES (22, 'Lagg´s', '1');
INSERT INTO `omar_marca` VALUES (23, 'Dolores', '1');
INSERT INTO `omar_marca` VALUES (24, 'POP', '1');
INSERT INTO `omar_marca` VALUES (25, 'Kellogg´s', '1');
INSERT INTO `omar_marca` VALUES (26, 'Mondelez International', '1');
INSERT INTO `omar_marca` VALUES (27, 'San Marcos', '1');
INSERT INTO `omar_marca` VALUES (28, 'Tres estrellas', '1');
INSERT INTO `omar_marca` VALUES (29, 'Arcor', '1');
INSERT INTO `omar_marca` VALUES (30, 'Bimbo', '1');
INSERT INTO `omar_marca` VALUES (33, 'Ricolino', '1');
INSERT INTO `omar_marca` VALUES (38, 'Samsung', '1');
INSERT INTO `omar_marca` VALUES (39, 'Sony', '1');
INSERT INTO `omar_marca` VALUES (40, 'Nokia', '1');
INSERT INTO `omar_marca` VALUES (41, 'Epson', '1');
INSERT INTO `omar_marca` VALUES (52, 'Samsung1', '1');
INSERT INTO `omar_marca` VALUES (53, 'Sony1', '1');
INSERT INTO `omar_marca` VALUES (54, 'Nokia1', '1');
INSERT INTO `omar_marca` VALUES (55, 'Epson1', '1');
INSERT INTO `omar_marca` VALUES (57, 'CarlosV', '1');
INSERT INTO `omar_marca` VALUES (60, 'Colgate', '1');
INSERT INTO `omar_marca` VALUES (68, 'Fabuloso1', '0');

-- ----------------------------
-- Table structure for omar_oferta
-- ----------------------------
DROP TABLE IF EXISTS `omar_oferta`;
CREATE TABLE `omar_oferta`  (
  `OMAR_ID_OFERTA` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_CLAVE_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CANTIDAD_OFERTA` float NOT NULL,
  `OMAR_FECHA_INICIO_OFERTA` date NOT NULL,
  `OMAR_FECHA_FINAL_OFERTA` date NOT NULL,
  `OMAR_STATUS_OFERTA` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CANTIDAD_REGALO_OFERTA` float NOT NULL,
  PRIMARY KEY (`OMAR_ID_OFERTA`) USING BTREE,
  INDEX `OMAR_OFERTA_PRODUCTO`(`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  CONSTRAINT `OMAR_OFERTA_PRODUCTO` FOREIGN KEY (`OMAR_CLAVE_PRODUCTO`) REFERENCES `omar_producto` (`OMAR_CLAVE_PRODUCTO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_oferta
-- ----------------------------
INSERT INTO `omar_oferta` VALUES (1, '750105533322175', 3, '2021-12-08', '2021-12-08', '1', 3);

-- ----------------------------
-- Table structure for omar_presentacion
-- ----------------------------
DROP TABLE IF EXISTS `omar_presentacion`;
CREATE TABLE `omar_presentacion`  (
  `OMAR_ID_PRESENTACION` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_DESCRIPCION_PRESENTACION` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_STATUS_PRESENTACION` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`OMAR_ID_PRESENTACION`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_presentacion
-- ----------------------------
INSERT INTO `omar_presentacion` VALUES (1, 'Bolsa', '1');
INSERT INTO `omar_presentacion` VALUES (2, 'Caja', '1');
INSERT INTO `omar_presentacion` VALUES (6, 'Bote', '1');
INSERT INTO `omar_presentacion` VALUES (8, 'Lata', '1');
INSERT INTO `omar_presentacion` VALUES (9, 'Empaque', '1');
INSERT INTO `omar_presentacion` VALUES (10, 'Botella', '1');
INSERT INTO `omar_presentacion` VALUES (11, 'Embase', '1');
INSERT INTO `omar_presentacion` VALUES (12, 'Embalado', '1');
INSERT INTO `omar_presentacion` VALUES (14, 'Carton', '1');
INSERT INTO `omar_presentacion` VALUES (16, 'Frasco', '1');
INSERT INTO `omar_presentacion` VALUES (19, 'Estuche12', '0');

-- ----------------------------
-- Table structure for omar_producto
-- ----------------------------
DROP TABLE IF EXISTS `omar_producto`;
CREATE TABLE `omar_producto`  (
  `OMAR_CLAVE_PRODUCTO` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_NOMBRE_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_DESCRIPCION_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_NOMBRE_CORTO_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `OMAR_PRECIO_ACTUAL_PRODUCTO` float NOT NULL,
  `OMAR_EXITENCIAS_PRODUCTO` float NOT NULL,
  `OMAR_STOCK_MIN_PRODUCTO` float NOT NULL,
  `OMAR_STOCK_MAX_PRODUCTO` float NOT NULL,
  `OMAR_CONTENIDO_NETO_PRODUCTO` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_DESCUENTO_PRODUCTO` float NOT NULL,
  `OMAR_ID_PRESENTACION` int(11) NOT NULL,
  `OMAR_ID_FAMILIA` int(11) NOT NULL,
  `OMAR_ID_MARCA` int(11) NOT NULL,
  PRIMARY KEY (`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  INDEX `OMAR_PRESENTACION_PRODUCTO`(`OMAR_ID_PRESENTACION`) USING BTREE,
  INDEX `OMAR_FAMILIA_PRODUCTO`(`OMAR_ID_FAMILIA`) USING BTREE,
  INDEX `OMAR_MARCA_PRODUCTO`(`OMAR_ID_MARCA`) USING BTREE,
  CONSTRAINT `OMAR_FAMILIA_PRODUCTO` FOREIGN KEY (`OMAR_ID_FAMILIA`) REFERENCES `omar_familia` (`OMAR_ID_FAMILIA`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `OMAR_MARCA_PRODUCTO` FOREIGN KEY (`OMAR_ID_MARCA`) REFERENCES `omar_marca` (`OMAR_ID_MARCA`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `OMAR_PRESENTACION_PRODUCTO` FOREIGN KEY (`OMAR_ID_PRESENTACION`) REFERENCES `omar_presentacion` (`OMAR_ID_PRESENTACION`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_producto
-- ----------------------------
INSERT INTO `omar_producto` VALUES ('038000148009891', 'Nutri barra', 'Enmboltura pequeña', 'Barra', 10, 147, 30, 100, '33 gr', 0, 1, 8, 25);
INSERT INTO `omar_producto` VALUES ('750004634991654', 'Te antiviral', 'Caja roja', 'Te', 20, 93, 30, 200, '24 gr', 0, 2, 4, 22);
INSERT INTO `omar_producto` VALUES ('750100333612523', 'Mermelada de Fresa', 'Vaso de vidrio', 'Mermelada', 18, 105, 30, 200, '270 gr', 0, 16, 10, 20);
INSERT INTO `omar_producto` VALUES ('750101605008796', 'Gansito', 'Enmboltorio naranja', 'Gansillo', 10, 35, 30, 250, '50 gr', 0, 1, 8, 16);
INSERT INTO `omar_producto` VALUES ('750101605008987', 'Elote en conserva', 'Lata hierro', 'Granos de elote', 18, 893, 30, 300, '220 gr', 0, 8, 3, 3);
INSERT INTO `omar_producto` VALUES ('750101605214001', 'Pimienta negra', 'frasco', 'Pimienta', 22, 89, 30, 200, '50 gr', 0, 16, 5, 19);
INSERT INTO `omar_producto` VALUES ('750101605430013', 'Salsa de tomate', '', 'Captsun', 13, 202, 30, 200, '220 gr', 0, 10, 5, 21);
INSERT INTO `omar_producto` VALUES ('750101656459827', 'Barra de Chcolate Abuelita', 'Envoltura', 'Barra de Chcolate ', 15, 82, 30, 200, '90 gr', 0, 1, 8, 4);
INSERT INTO `omar_producto` VALUES ('750101659086789', 'Coffe Mate', 'Botella blanca', 'Coffe Mate', 17, 67, 30, 200, '160 gr', 0, 10, 4, 4);
INSERT INTO `omar_producto` VALUES ('750105533322175', 'MIEL CARLOTA', '', 'MIEL CARL', 15, 223, 20, 100, '350 gr', 0, 10, 1, 1);
INSERT INTO `omar_producto` VALUES ('750106921070597', 'Harina de arroz', 'Caja chica', 'Harina de arroz', 13, 135, 30, 200, '500 gr', 0, 2, 11, 28);
INSERT INTO `omar_producto` VALUES ('750181605008658', 'Aceite Nutrioli', 'Botella de aceite', 'Nutrioli', 20, 98, 30, 200, '850 ml', 0, 10, 9, 18);
INSERT INTO `omar_producto` VALUES ('750181605008966', 'Palillos', 'Mondadientes', 'Palillos', 15, 89, 30, 200, '100 g', 0, 12, 12, 24);
INSERT INTO `omar_producto` VALUES ('750181605076546', 'Chiles chipotles', 'Lata de conservas', 'Chipotles', 11, 148, 30, 200, '100 g', 0, 8, 3, 27);
INSERT INTO `omar_producto` VALUES ('750850660507654', 'Halls', 'Caramelos', 'Dulces Halls', 12, 145, 30, 200, '25 g', 0, 12, 8, 26);
INSERT INTO `omar_producto` VALUES ('750890660507654', 'Atun Dolores', 'Lata de conservas', 'Atun', 14, 182, 30, 200, '133 g', 0, 8, 3, 23);
INSERT INTO `omar_producto` VALUES ('7509723530507654', 'Pan Bimbo', '', 'Pan', 25, 82, 30, 200, '675 g', 0, 1, 7, 30);
INSERT INTO `omar_producto` VALUES ('7509782660507654', 'Platanos fritos', 'Platanos', 'Platanitos', 15, 101, 30, 200, '100 g', 0, 1, 2, 17);
INSERT INTO `omar_producto` VALUES ('7509787530507654', 'Amaranto', '', 'Barra de amaranto', 16, 148, 30, 200, '70 g', 0, 1, 8, 17);
INSERT INTO `omar_producto` VALUES ('7512165009067', 'Totis', 'Pequeña Bolsa de frituras', 'Totis', 3, 22, 10, 40, '22g', 0, 1, 2, 3);
INSERT INTO `omar_producto` VALUES ('7589672353050766', 'Chocolates bon bon', '', 'Chocolate', 30, 74, 30, 200, '270 g', 0, 2, 8, 29);
INSERT INTO `omar_producto` VALUES ('760505573322175', 'PAKETAXO DE QUESO', 'CHICA', 'PAQUETAXO', 11, 128, 30, 200, '100 gr', 0, 1, 4, 2);

-- ----------------------------
-- Table structure for omar_producto_proveedor
-- ----------------------------
DROP TABLE IF EXISTS `omar_producto_proveedor`;
CREATE TABLE `omar_producto_proveedor`  (
  `OMAR_CLAVE_PRODUCTO` varchar(21) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CLAVE_PROVEEDOR` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_PRIORIODAD` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  INDEX `OMAR_PP_PRODUCTO`(`OMAR_CLAVE_PRODUCTO`) USING BTREE,
  INDEX `OMAR_PP_PROVEEDOR`(`OMAR_CLAVE_PROVEEDOR`) USING BTREE,
  CONSTRAINT `OMAR_PP_PRODUCTO` FOREIGN KEY (`OMAR_CLAVE_PRODUCTO`) REFERENCES `omar_producto` (`OMAR_CLAVE_PRODUCTO`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `OMAR_PP_PROVEEDOR` FOREIGN KEY (`OMAR_CLAVE_PROVEEDOR`) REFERENCES `omar_proveedor` (`OMAR_CLAVE_PROVEEDOR`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_producto_proveedor
-- ----------------------------
INSERT INTO `omar_producto_proveedor` VALUES ('750105533322175', 'A5631', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('038000148009891', 'A5642', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750004634991654', 'A5641', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750100333612523', 'A5631', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101605008796', 'A5635', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101605008987', 'A5631', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101605214001', 'A5638', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101605430013', 'A5639', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101656459827', 'AH637', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750101659086789', 'AH637', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750105533322175', 'A5632', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750106921070597', 'A5646', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750181605008658', 'A5637', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750181605008966', 'A5634', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750181605076546', 'A5645', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750850660507654', 'A5643', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('750890660507654', 'A5644', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('7509723530507654', 'A5635', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('7509782660507654', 'A5640', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('7509787530507654', 'A5640', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('7589672353050766', 'A5636', '0');
INSERT INTO `omar_producto_proveedor` VALUES ('760505573322175', 'A5632', '0');

-- ----------------------------
-- Table structure for omar_proveedor
-- ----------------------------
DROP TABLE IF EXISTS `omar_proveedor`;
CREATE TABLE `omar_proveedor`  (
  `OMAR_CLAVE_PROVEEDOR` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_RAZON_SOCILA_PROVEEDOR` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_TELEFONO_PROVEEDOR` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_DIRECCION_PROVEEDOR` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_EMAIL_PROVEEDOR` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_CONTACTO_PROVEEDOR` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `OMAR_STATUS_PROVEDOR` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`OMAR_CLAVE_PROVEEDOR`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of omar_proveedor
-- ----------------------------
INSERT INTO `omar_proveedor` VALUES ('A5631', 'MacCormick Mexico S.A DE C.V', '559875897', 'San Bartolo Naucalpan No. 360', 'Macormick.com', 'Oficinas Macormick', '1');
INSERT INTO `omar_proveedor` VALUES ('A5632', 'PepsiCo Mescio S. de R.L de C.V', '8009019500', 'Bosque de Duraznos No.67, Col Bosque de las Lomas C.P 11700, Ciudad de México', 'Paquetaxo_Mx.com', 'Oficinas de Pepsico', '1');
INSERT INTO `omar_proveedor` VALUES ('A5633', 'Conservas La costeña, S.A de C.V', '8002678362', 'Via Morelos 268, Col.Santa Maria Tultepec, Ecatepec, Edo. De Mex, Mexico', 'lacostena.com.mx', 'Oficinas la Costeña', '1');
INSERT INTO `omar_proveedor` VALUES ('A5634', 'Producto Plasticos de Madera, S.A de C.V', '18006244942', 'Fracc.Bridec Lote No.6  Cd. Industrial Merida, Yucatan, Mexico', 'clientes @proma.com.mx', 'Oficinas PROMA', '1');
INSERT INTO `omar_proveedor` VALUES ('A5635', 'Bimbo S.A de C.V', '18006124942', 'Mimosas No. 117 col. Santa Maria Insurgentes, Cuauhtemoc Cd. Mexico', 'bimbo.com.mx', 'Oficinas Bimbo', '1');
INSERT INTO `omar_proveedor` VALUES ('A5636', 'Unidal Mexico S.A de C.V', '8001233152', 'Cuajimalpa morelos Ciudad de Mexico', 'arcor.com.mx', 'Oficinas arcor', '1');
INSERT INTO `omar_proveedor` VALUES ('A5637', 'Ragasa industrias S.A de C.V', '80096887454', 'Col. Mitras Norte Monterrey, Nuevo Leon', 'nutrioli.com.mx', 'Oficinas nutrioli', '1');
INSERT INTO `omar_proveedor` VALUES ('A5638', 'Comercializadora Mexico Americana S de R.L. de C.V', '', 'Santa Cruz Acayucan Azcapolzalco Ciudad de Mexico', 'www.carmensita.com.mx', 'Oficinas molinillo', '1');
INSERT INTO `omar_proveedor` VALUES ('A5639', 'ConAgra Foods Mexico S.A de C.V', '8008494424', 'Irapuarto Guanajuato Mexico', 'www.conagrabrands.com.mx', 'Oficinas Del Monte', '1');
INSERT INTO `omar_proveedor` VALUES ('A5640', 'RFC RORA781018361', '7711294666', 'Nezahualcoyotl EDO. MEX.', 'amarantoymiel.com', 'Oficinas abejita', '1');
INSERT INTO `omar_proveedor` VALUES ('A5641', 'Supreme Tea, S.A. de C.V.', '5564749890', 'Coyoacan, CDMX', 'lagss.com.mx', 'Oficinas Laggs', '1');
INSERT INTO `omar_proveedor` VALUES ('A5642', 'Kellogg S.A. de C.V.', '', 'San Antonio de la punta, Queretaro', 'Kelloggs.com.mx', 'Oficinas Kelloggs', '1');
INSERT INTO `omar_proveedor` VALUES ('A5643', 'Modelez  Mexico S. de R.L. de C.V.', '8007152020', 'Ciudad de Mexico', 'Halls.com.mx', 'Oficinas halls', '1');
INSERT INTO `omar_proveedor` VALUES ('A5644', 'Pescados industrilizados S.A. de C.V.', '8007152020', 'Ciudad de Mexico', 'www.pisa.com', 'Oficinas dolores', '1');
INSERT INTO `omar_proveedor` VALUES ('A5645', 'Empacadora San Marcos S.A. de C.V.', '8002168041', 'Nopalucan, Puebla', 'www.alimentossanmarcos.com', 'Oficinas San Marcos', '1');
INSERT INTO `omar_proveedor` VALUES ('A5646', 'Molinas del Sudeste S.A. de C.V.', '8001112672', 'Ejido Puebla, Mexicali, Baja California, Mexico', 'www.Tres/Estrellas.com', 'Oficinas Tres estrellas', '1');
INSERT INTO `omar_proveedor` VALUES ('AH637', 'Nestle Mexico S.A de C.V', '5552673330', 'Miguel de Cervantes Savedra No. 301 PB Torre Sur, Col. Granada, Ciudad de México', 'www.nestle.com.mx', 'Oficinas Nestle', '1');

-- ----------------------------
-- Table structure for omar_venta
-- ----------------------------
DROP TABLE IF EXISTS `omar_venta`;
CREATE TABLE `omar_venta`  (
  `OMAR_FOLIO_VENTA` int(11) NOT NULL AUTO_INCREMENT,
  `OMAR_FECHA_HORA_VENTA` datetime(0) NOT NULL,
  `OMAR_TOTAL_VENTA` float NOT NULL,
  `OMAR_PRECIO_VENTA` float NOT NULL,
  `OMAR_DESCUENTO_VENTA` float NOT NULL,
  PRIMARY KEY (`OMAR_FOLIO_VENTA`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of omar_venta
-- ----------------------------
INSERT INTO `omar_venta` VALUES (1, '2021-12-11 11:45:17', 100, 80, 0);
INSERT INTO `omar_venta` VALUES (2, '2021-12-15 20:25:33', 80, 80, 0);
INSERT INTO `omar_venta` VALUES (3, '2021-12-15 20:26:00', 30, 30, 0);
INSERT INTO `omar_venta` VALUES (4, '2021-12-15 20:39:36', 40, 40, 0);
INSERT INTO `omar_venta` VALUES (5, '2021-12-15 20:39:42', 50, 50, 0);
INSERT INTO `omar_venta` VALUES (6, '2021-12-15 20:41:00', 45, 45, 0);
INSERT INTO `omar_venta` VALUES (7, '2021-12-15 20:44:33', 60, 60, 0);
INSERT INTO `omar_venta` VALUES (8, '2021-12-15 20:44:49', 10, 10, 0);
INSERT INTO `omar_venta` VALUES (9, '2021-12-15 20:44:58', 24, 24, 0);
INSERT INTO `omar_venta` VALUES (10, '2021-12-15 20:45:08', 36, 46, 0);
INSERT INTO `omar_venta` VALUES (11, '2021-12-15 20:47:14', 70, 70, 0);
INSERT INTO `omar_venta` VALUES (12, '2021-12-15 20:47:33', 80, 80, 0);
INSERT INTO `omar_venta` VALUES (13, '2021-12-15 20:51:31', 100, 100, 0);
INSERT INTO `omar_venta` VALUES (14, '2021-12-15 20:51:54', 70, 70, 0);
INSERT INTO `omar_venta` VALUES (15, '2021-12-15 20:52:04', 60, 60, 0);
INSERT INTO `omar_venta` VALUES (16, '2021-12-15 20:55:44', 200, 200, 0);
INSERT INTO `omar_venta` VALUES (17, '2021-12-15 20:55:52', 100, 100, 0);
INSERT INTO `omar_venta` VALUES (18, '2021-12-15 20:58:11', 300, 300, 0);
INSERT INTO `omar_venta` VALUES (19, '2021-12-15 20:58:30', 350, 350, 0);
INSERT INTO `omar_venta` VALUES (20, '2021-12-15 20:58:51', 150, 150, 0);
INSERT INTO `omar_venta` VALUES (21, '2021-12-15 20:59:03', 250, 250, 0);
INSERT INTO `omar_venta` VALUES (22, '2021-12-15 21:00:12', 90, 90, 0);
INSERT INTO `omar_venta` VALUES (23, '2021-12-15 21:01:23', 80, 80, 0);
INSERT INTO `omar_venta` VALUES (24, '2021-12-15 21:01:30', 50, 50, 0);
INSERT INTO `omar_venta` VALUES (25, '2021-12-15 21:02:33', 40, 40, 0);
INSERT INTO `omar_venta` VALUES (26, '2022-01-17 21:55:39', 41, 40, 0);
INSERT INTO `omar_venta` VALUES (29, '2022-01-18 00:25:13', 41, 46, 5);
INSERT INTO `omar_venta` VALUES (30, '2022-01-18 00:31:14', 46, 47, 1.1);
INSERT INTO `omar_venta` VALUES (31, '2022-01-18 21:37:36', 47, 41, 6);

-- ----------------------------
-- Procedure structure for omar_insertar_compra
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_insertar_compra`;
delimiter ;;
CREATE PROCEDURE `omar_insertar_compra`(p_OMAR_FOLIO_TICKET_COMPRA VARCHAR(255), p_OMAR_CLAVE_PROVEEDOR VARCHAR(21), p_OMAR_FECHA_HORA_COMPRA DATETIME, p_OMAR_TOTAL_DE_COMPRA FLOAT)
BEGIN
DECLARE omar_vclave_provedor Varchar (21);
SELECT omar_proveedor.OMAR_CLAVE_PROVEEDOR INTO omar_vclave_provedor FROM omar_proveedor WHERE omar_proveedor.OMAR_CLAVE_PROVEEDOR=trim(p_OMAR_CLAVE_PROVEEDOR);
if omar_vclave_provedor = TRIM(p_OMAR_CLAVE_PROVEEDOR) THEN
INSERT omar_compra VALUES (DEFAULT, TRIM(p_OMAR_FOLIO_TICKET_COMPRA), TRIM(p_OMAR_CLAVE_PROVEEDOR), TRIM(p_OMAR_FECHA_HORA_COMPRA), TRIM(p_OMAR_TOTAL_DE_COMPRA));
else 
SELECT 'No se encuentra el proveedor' AS MENSAJE_BD_1;
end if;
select p_OMAR_FOLIO_TICKET_COMPRA as Folio_de_compra, p_OMAR_CLAVE_PROVEEDOR as Proveedor, p_OMAR_FECHA_HORA_COMPRA as Fecha_Hora_Compra, p_OMAR_TOTAL_DE_COMPRA as Total from omar_compra WHERE omar_compra.OMAR_CLAVE_PROVEEDOR=TRIM(p_OMAR_CLAVE_PROVEEDOR);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_cliente
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_cliente`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_cliente`(p_OMAR_RFC_CLIENTE VARCHAR(13), p_OMAR_NOMBRE_CLIENTE varchar(255), p_OMAR_APELLIDO1_CLIENTE VARCHAR(255), p_OMAR_APELLIDO2_CLIENTE VARCHAR(255), p_OMAR_DIRECCION_CLIENTE VARCHAR(255), p_OMAR_TELEFONO_CLIENTE VARCHAR(255), p_OMAR_CURP_CLIENTE VARCHAR(255), p_OMAR_EMAIL_CLIENTE VARCHAR(255))
BEGIN
DECLARE omar_cliente_fun1 VARCHAR(255);
SELECT omar_clientes.OMAR_RFC_CLIENTE INTO omar_cliente_fun1 FROM omar_clientes WHERE omar_clientes.OMAR_RFC_CLIENTE=trim(p_OMAR_RFC_CLIENTE);
if trim(p_OMAR_RFC_CLIENTE)=omar_cliente_fun1 then
select 'El RFC QUE SE INTENTA REGISTRAR ESTA REPETIDO' AS MENSAJEBD;
ELSE
INSERT omar_clientes VALUES (TRIM(p_OMAR_RFC_CLIENTE), TRIM(p_OMAR_NOMBRE_CLIENTE), TRIM(p_OMAR_APELLIDO1_CLIENTE), TRIM(p_OMAR_APELLIDO2_CLIENTE), TRIM( p_OMAR_DIRECCION_CLIENTE ), TRIM(p_OMAR_TELEFONO_CLIENTE), TRIM(p_OMAR_CURP_CLIENTE ), TRIM(P_OMAR_EMAIL_CLIENTE));
END IF;
select omar_clientes.OMAR_RFC_CLIENTE as RFC_del_Cliente from omar_clientes where omar_clientes.OMAR_RFC_CLIENTE=(TRIM(p_OMAR_RFC_CLIENTE));
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_DC
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_DC`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_DC`(p_OMAR_ID_COMPRA INT, p_OMAR_CLAVE_PRODUCTO VARCHAR (21), p_OMAR_PRECIO_COMPRA FLOAT, p_OMAR_CANTIDAD_COMPRA FLOAT)
BEGIN
DECLARE omar_vid_compra INT;
DECLARE omar_vclave_producto VARCHAR (21);
SELECT omar_compra.OMAR_ID_COMPRA INTO omar_vid_compra FROM omar_compra WHERE omar_compra.OMAR_ID_COMPRA=trim(p_OMAR_ID_COMPRA);
SELECT omar_producto.OMAR_CLAVE_PRODUCTO INTO omar_vclave_producto FROM omar_producto WHERE omar_producto.OMAR_CLAVE_PRODUCTO=trim(p_OMAR_CLAVE_PRODUCTO);
IF omar_vid_compra=TRIM(p_OMAR_ID_COMPRA) AND omar_vclave_producto=TRIM(p_OMAR_CLAVE_PRODUCTO) then
INSERT omar_detalle_compra VALUES (DEFAULT, TRIM(p_OMAR_ID_COMPRA), TRIM(p_OMAR_CLAVE_PRODUCTO), TRIM(p_OMAR_PRECIO_COMPRA), TRIM( p_OMAR_CANTIDAD_COMPRA));
else
SELECT 'No se encuentra la clalve del producto o la compra' AS MENSAJE_BD_1;
end if;
SELECT p_OMAR_CLAVE_PRODUCTO AS Clave_Productp, p_OMAR_PRECIO_COMPRA AS Precio_Compra, p_OMAR_CANTIDAD_COMPRA AS Cantidad_Productos FROM omar_detalle_compra WHERE omar_detalle_compra.OMAR_ID_COMPRA=TRIM(p_OMAR_ID_COMPRA);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_devolucion
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_devolucion`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_devolucion`(p_OMAR_NOMBRE_PRODUCTO VARCHAR(255), p_OMAR_CANTIDAD_DEVOLUCIONES FLOAT, p_OMAR_FECHA_DEVOLUCION DATE, p_OMAR_FECHA_LIM_DEVOLUCION DATE)
BEGIN
DECLARE omar_vnombre_producto VARCHAR(255);
SELECT omar_producto.OMAR_NOMBRE_PRODUCTO INTO omar_vnombre_producto FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO=trim(p_OMAR_NOMBRE_PRODUCTO);

IF omar_vnombre_producto = TRIM(p_OMAR_NOMBRE_PRODUCTO) then
INSERT omar_devolucion VALUES (DEFAULT, (SELECT omar_producto.OMAR_CLAVE_PRODUCTO FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO= TRIM(p_OMAR_NOMBRE_PRODUCTO) LIMIT 1), TRIM(p_OMAR_CANTIDAD_DEVOLUCIONES), '1', TRIM(p_OMAR_FECHA_DEVOLUCION), TRIM(p_OMAR_FECHA_LIM_DEVOLUCION));
ELSE
SELECT 'Este propducto no Esta registrado' AS MENSAJE_BD;
END IF;
SELECT omar_producto.OMAR_NOMBRE_PRODUCTO as Producto,omar_devolucion.OMAR_CANTIDAD_DEVOLUCIONES as Cantidad_devuelta,
omar_devolucion.OMAR_FECHA_DEVOLUCION as Fecha_Devuelta
from omar_producto join omar_devolucion on omar_producto.OMAR_CLAVE_PRODUCTO=omar_devolucion.OMAR_CLAVE_PRODUCTO;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_DV
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_DV`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_DV`(p_OMAR_FOLIO_VENTA INT, p_OMAR_CLAVE_PRODUCTO VARCHAR (21), p_OMAR_CANTIDAD_VENTA FLOAT, p_OMAR_PRECIO_VENTA FLOAT, p_OMAR_TOTAL_CP FLOAT, p_OMAR_DESCUENTO_VENTA FLOAT)
Begin
Declare omar_vfolio_venta INT;
DECLARE omar_vclave_producto VARCHAR(21);
SELECT omar_producto.OMAR_CLAVE_PRODUCTO INTO omar_vclave_producto FROM omar_producto WHERE omar_producto.OMAR_CLAVE_PRODUCTO=trim(p_OMAR_CLAVE_PRODUCTO);
SELECT omar_venta.OMAR_FOLIO_VENTA INTO omar_vfolio_venta FROM omar_venta WHERE omar_venta.OMAR_FOLIO_VENTA = TRIM(p_OMAR_FOLIO_VENTA);
If omar_vfolio_venta=TRIM(p_OMAR_FOLIO_VENTA) AND omar_vclave_producto=TRIM(p_OMAR_CLAVE_PRODUCTO) then
INSERT omar_detalle_venta VALUES (DEFAULT,TRIM(p_OMAR_FOLIO_VENTA),TRIM(p_OMAR_CLAVE_PRODUCTO), TRIM( p_OMAR_CANTIDAD_VENTA), trim(p_OMAR_PRECIO_VENTA), TRIM(p_OMAR_TOTAL_CP), TRIM(p_OMAR_DESCUENTO_VENTA));
else
SELECT 'No se encuentra la clave del producto o el folio de la venta' AS Mensaje_BD_1;
end if;
SELECT p_OMAR_CLAVE_PRODUCTO as Clave_Producto, p_OMAR_CANTIDAD_VENTA as Cantidad_Producto, p_OMAR_PRECIO_VENTA as Precio_Venta, p_OMAR_DESCUENTO_VENTA as  Descuento FROM omar_detalle_venta where omar_detalle_venta.OMAR_FOLIO_VENTA = TRIM(p_OMAR_FOLIO_VENTA);
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_familia
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_familia`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_familia`(p_OMAR_DESCRIPCION_FAMILIA VARCHAR(255))
BEGIN
DECLARE omar_familia_fun VARCHAR(255);
SELECT omar_familia.OMAR_DESCRIPCION_FAMILIA INTO omar_familia_fun FROM omar_familia WHERE omar_familia.OMAR_DESCRIPCION_FAMILIA=trim(p_OMAR_DESCRIPCION_FAMILIA);
if trim(p_OMAR_DESCRIPCION_FAMILIA)=omar_familia_fun then
select 'LA DESCRIPCION QUE SE INTENTA REGISTRAR ESTA REPETIDA' AS MENSAJEBD;
UPDATE omar_familia SET omar_familia.OMAR_STATUS_FAMILIA='1' where omar_familia.OMAR_DESCRIPCION_FAMILIA=trim(p_OMAR_DESCRIPCION_FAMILIA);
ELSE
INSERT omar_familia VALUES (DEFAULT,TRIM(p_OMAR_DESCRIPCION_FAMILIA), '1');
END IF;
select omar_familia.OMAR_DESCRIPCION_FAMILIA as Descripcion_de_la_Familia from omar_familia where omar_familia.OMAR_STATUS_FAMILIA='1';
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_marca
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_marca`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_marca`(p_OMAR_NOMBRE_MARCA VARCHAR(255))
BEGIN
DECLARE omar_marca VARCHAR(255);
SELECT omar_marca.OMAR_NOMBRE_MARCA INTO omar_marca FROM omar_marca WHERE omar_marca.OMAR_NOMBRE_MARCA=trim(p_OMAR_NOMBRE_MARCA);
if trim(p_OMAR_NOMBRE_MARCA)=omar_marca then
select 'LA MARCA QUE SE INTENTA REGISTRAR ES REPETIDA' AS MENSAJEBD;
UPDATE omar_marca SET omar_marca.OMAR_STATUS='1' where omar_marca.OMAR_NOMBRE_MARCA=trim(p_OMAR_NOMBRE_MARCA);
ELSE
INSERT omar_marca VALUES (DEFAULT,TRIM(p_OMAR_NOMBRE_MARCA), '1');
END IF;
select omar_marca.OMAR_NOMBRE_MARCA as Marca from omar_marca where omar_marca.OMAR_STATUS='1';
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_oferta
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_oferta`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_oferta`(p_OMAR_NOMBRE_PRODUCTO VARCHAR(255), p_OMAR_CANTIDAD_OFERTA FLOAT, p_OMAR_FECHA_INICIO_OFERTA DATE, p_OMAR_FECHA_FINAL_OFERTA DATE, p_OMAR_CANTIDAD_REGALO_OFERTA FLOAT)
BEGIN
DECLARE omar_vnombre_Producto_oferta VARCHAR (255);
SELECT omar_producto.OMAR_NOMBRE_PRODUCTO INTO omar_vnombre_Producto_oferta FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO=trim(p_OMAR_NOMBRE_PRODUCTO);

IF omar_vnombre_Producto_oferta = TRIM(p_OMAR_NOMBRE_PRODUCTO) then
INSERT omar_oferta VALUES (DEFAULT, (SELECT omar_producto.OMAR_CLAVE_PRODUCTO FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO= TRIM(p_OMAR_NOMBRE_PRODUCTO) LIMIT 1), TRIM(p_OMAR_CANTIDAD_OFERTA), TRIM(p_OMAR_FECHA_INICIO_OFERTA), TRIM(p_OMAR_FECHA_FINAL_OFERTA),'1',TRIM(p_OMAR_CANTIDAD_REGALO_OFERTA));
ELSE
SELECT 'Este propducto no Esta registrado' AS MENSAJE_BD;
END IF;
SELECT omar_producto.OMAR_NOMBRE_PRODUCTO as Producto,omar_oferta.OMAR_CANTIDAD_OFERTA as Cantidad_Oferta,
omar_oferta.OMAR_FECHA_INICIO_OFERTA as Fecha_Inicial_Oferta, omar_oferta.OMAR_FECHA_FINAL_OFERTA as Fecha_Final_Oferta
from omar_producto join omar_oferta on omar_producto.OMAR_CLAVE_PRODUCTO=omar_oferta.OMAR_CLAVE_PRODUCTO;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_presentacion
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_presentacion`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_presentacion`(p_OMAR_DESCRIPCION_PRESENTACION VARCHAR(255))
BEGIN
DECLARE omar_presentacion_fun VARCHAR(255);
SELECT omar_presentacion.OMAR_DESCRIPCION_PRESENTACION INTO omar_presentacion_fun FROM omar_presentacion WHERE omar_presentacion.OMAR_DESCRIPCION_PRESENTACION=trim(p_OMAR_DESCRIPCION_PRESENTACION);
if trim(p_OMAR_DESCRIPCION_PRESENTACION)=omar_presentacion_fun then
select 'LA DESCRIPCION QUE SE INTENTA REGISTRAR ESTA REPETIDA' AS MENSAJEBD;
UPDATE omar_presentacion SET omar_presentacion.OMAR_STATUS_PRESENTACION='1' where omar_presentacion.OMAR_DESCRIPCION_PRESENTACION=trim(p_OMAR_DESCRIPCION_PRESENTACION);
ELSE
INSERT omar_presentacion VALUES (DEFAULT,TRIM(p_OMAR_DESCRIPCION_PRESENTACION), '1');
END IF;
select omar_presentacion.OMAR_DESCRIPCION_PRESENTACION as Descripcion_de_la_Presentacion from omar_presentacion where omar_presentacion.OMAR_STATUS_PRESENTACION='1';
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_producto
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_producto`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_producto`(p_OMAR_CLAVE_PRODUCTO VARCHAR(21),
p_OMAR_NOMBRE_PRODUCTO VARCHAR(255),
p_OMAR_DESCRIPCION_PRODUCTO VARCHAR(255),
p_OMAR_NOMBRE_CORTO_PRODUCTO VARCHAR(255),
p_OMAR_PRECIO_ACTUAL_PRODUCTO FLOAT,
p_OMAR_EXITENCIAS_PRODUCTO FLOAT,
p_OMAR_STOCK_MIN_PRODUCTO FLOAT,
p_OMAR_STOCK_MAX_PRODUCTO FLOAT,
p_OMAR_CONTENIDO_NETO_PRODUCTO VARCHAR(255),
p_OMAR_DESCUENTO_PRODUCTO FLOAT,
p_OMAR_DESCRIPCION_PRESENTACION VARCHAR(255),
P_OMAR_DESCRIPCION_FAMILIA VARCHAR(255),
p_OMAR_NOMBRE_MARCA VARCHAR(255))
BEGIN
DECLARE omar_producto_vpresentacion VARCHAR(255);
DECLARE omar_producto_vfamilia VARCHAR(255);
DECLARE omar_producto_vmarca VARCHAR(255);
SELECT omar_presentacion.OMAR_DESCRIPCION_PRESENTACION INTO omar_producto_vpresentacion FROM omar_presentacion WHERE omar_presentacion.OMAR_DESCRIPCION_PRESENTACION=trim(p_OMAR_DESCRIPCION_PRESENTACION);
SELECT omar_familia.OMAR_DESCRIPCION_FAMILIA INTO omar_producto_vfamilia FROM omar_familia WHERE omar_familia.OMAR_DESCRIPCION_FAMILIA=trim(p_OMAR_DESCRIPCION_FAMILIA);
SELECT omar_marca.OMAR_NOMBRE_MARCA INTO omar_producto_vmarca FROM omar_marca WHERE omar_marca.OMAR_NOMBRE_MARCA=trim(p_OMAR_NOMBRE_MARCA);
If TRIM(p_OMAR_DESCRIPCION_PRESENTACION)=omar_producto_vpresentacion AND TRIM(p_OMAR_DESCRIPCION_FAMILIA)=omar_producto_vfamilia AND TRIM(p_OMAR_NOMBRE_MARCA)=omar_producto_vmarca then
INSERT omar_producto VALUES(
p_OMAR_CLAVE_PRODUCTO,
p_OMAR_NOMBRE_PRODUCTO,
p_OMAR_DESCRIPCION_PRODUCTO,
p_OMAR_NOMBRE_CORTO_PRODUCTO,
p_OMAR_PRECIO_ACTUAL_PRODUCTO,
p_OMAR_EXITENCIAS_PRODUCTO,
p_OMAR_STOCK_MIN_PRODUCTO,
p_OMAR_STOCK_MAX_PRODUCTO,
p_OMAR_CONTENIDO_NETO_PRODUCTO,
p_OMAR_DESCUENTO_PRODUCTO,
(SELECT omar_presentacion.OMAR_ID_PRESENTACION FROM omar_presentacion WHERE omar_presentacion.OMAR_DESCRIPCION_PRESENTACION= p_OMAR_DESCRIPCION_PRESENTACION LIMIT 1),
(SELECT omar_familia.OMAR_ID_FAMILIA FROM omar_familia WHERE omar_familia.OMAR_DESCRIPCION_FAMILIA=p_OMAR_DESCRIPCION_FAMILIA LIMIT 1),
(SELECT omar_marca.OMAR_ID_MARCA FROM omar_marca WHERE omar_marca.OMAR_NOMBRE_MARCA=p_OMAR_NOMBRE_MARCA LIMIT 1));
select 'Registro Insertado' AS MENSAJE_BD_1;
ELSE
select 'Uno de los campos(presentacion, marca o familia), no se encuentra en la base de datos, coloca el registro de dicho campo en su correspondiente tabla' AS MENSAJE_BD_2;
END IF;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_producto_provedor
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_producto_provedor`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_producto_provedor`(p_OMAR_NOMBRE_PRODUCTO VARCHAR(255),p_OMAR_RAZON_SOCILA_PROVEEDOR VARCHAR(255), p_OMAR_PRIORIODAD CHAR)
BEGIN
DECLARE omar_vnombre_producto VARCHAR (255);
DECLARE omar_razon_provedor VARCHAR (255);
SELECT omar_producto.OMAR_NOMBRE_PRODUCTO INTO omar_vnombre_producto FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO=trim(p_OMAR_NOMBRE_PRODUCTO);
SELECT omar_proveedor.OMAR_RAZON_SOCILA_PROVEEDOR INTO omar_razon_provedor FROM omar_proveedor WHERE omar_proveedor.OMAR_RAZON_SOCILA_PROVEEDOR=trim(p_OMAR_RAZON_SOCILA_PROVEEDOR);
IF omar_vnombre_producto = TRIM(p_OMAR_NOMBRE_PRODUCTO) AND omar_razon_provedor=TRIM(p_OMAR_RAZON_SOCILA_PROVEEDOR) THEN
INSERT omar_producto_proveedor VALUES ((SELECT omar_producto.OMAR_CLAVE_PRODUCTO FROM omar_producto WHERE omar_producto.OMAR_NOMBRE_PRODUCTO= TRIM(p_OMAR_NOMBRE_PRODUCTO) LIMIT 1),(SELECT omar_proveedor.OMAR_CLAVE_PROVEEDOR FROM omar_proveedor WHERE omar_proveedor.OMAR_RAZON_SOCILA_PROVEEDOR= TRIM(p_OMAR_RAZON_SOCILA_PROVEEDOR) LIMIT 1), TRIM(p_OMAR_PRIORIODAD));
ELSE
SELECT 'El producto o el provedor no esta registrado' AS MENSAJE_BD;
END IF;
select p_OMAR_RAZON_SOCILA_PROVEEDOR as Proveedor, p_OMAR_NOMBRE_PRODUCTO as Producto, p_OMAR_PRIORIODAD as Prioridad from omar_proveedor join omar_producto_proveedor
on omar_proveedor.OMAR_CLAVE_PROVEEDOR=omar_producto_proveedor.OMAR_CLAVE_PROVEEDOR;

END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_proveedor
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_proveedor`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_proveedor`(p_OMAR_CLAVE_PROVEEDOR VARCHAR(15), p_OMAR_RAZON_SOCILA_PROVEEDOR varchar(255), p_OMAR_TELEFONO_PROVEEDOR VARCHAR(255), p_OMAR_DIRECCION_PROVEEDOR VARCHAR(255), p_OMAR_EMAIL_PROVEEDOR VARCHAR(255), p_OMAR_CONTACTO_PROVEEDOR VARCHAR(255))
BEGIN
DECLARE omar_proveedor_fun1 VARCHAR(255);
SELECT omar_proveedor.OMAR_CLAVE_PROVEEDOR INTO omar_proveedor_fun1 FROM omar_proveedor WHERE omar_proveedor.OMAR_CLAVE_PROVEEDOR=trim(p_OMAR_CLAVE_PROVEEDOR);
if trim(p_OMAR_CLAVE_PROVEEDOR)=omar_proveedor_fun1 then
select 'LA CLAVE QUE SE INTENTA REGISTRAR ESTA REPETIDA' AS MENSAJEBD;
UPDATE omar_proveedor SET omar_proveedor.OMAR_STATUS_PROVEDOR='1' where omar_proveedor.OMAR_CLAVE_PROVEEDOR=trim(p_OMAR_CLAVE_PROVEEDOR);
ELSE
INSERT omar_proveedor VALUES (TRIM(p_OMAR_CLAVE_PROVEEDOR), TRIM(p_OMAR_RAZON_SOCILA_PROVEEDOR), TRIM(p_OMAR_TELEFONO_PROVEEDOR), TRIM(p_OMAR_DIRECCION_PROVEEDOR), TRIM( p_OMAR_EMAIL_PROVEEDOR), TRIM(p_OMAR_CONTACTO_PROVEEDOR),'1');
END IF;
select omar_proveedor.OMAR_CLAVE_PROVEEDOR as Clave_Del_Proveedor from omar_proveedor where omar_proveedor.OMAR_STATUS_PROVEDOR='1';
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_inserta_venta
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_inserta_venta`;
delimiter ;;
CREATE PROCEDURE `omar_inserta_venta`(p_OMAR_TOTAL_VENTA FLOAT, p_OMAR_PRECIO_VENTA FLOAT, p_OMAR_DESCUENTO_VENTA float)
BEGIN
INSERT omar_venta VALUES (DEFAULT, NOW(), p_OMAR_TOTAL_VENTA,p_OMAR_PRECIO_VENTA,p_OMAR_DESCUENTO_VENTA);
SELECT 'Registrado' as Mensaje_BD_1;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for omar_prueba
-- ----------------------------
DROP PROCEDURE IF EXISTS `omar_prueba`;
delimiter ;;
CREATE PROCEDURE `omar_prueba`()
BEGIN
START TRANSACTION;
INSERT omar_marca VALUES(DEFAULT,'Samsung1',1);
INSERT omar_marca VALUES(DEFAULT,'Sony1',1);
INSERT omar_marca VALUES(DEFAULT,'Nokia1',1);
INSERT omar_marca VALUES(DEFAULT,'Epson1',1);
COMMIT;
END
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table omar_detalle_compra
-- ----------------------------
DROP TRIGGER IF EXISTS `OMAR_ACTULIZACION_EXISTENCIAS`;
delimiter ;;
CREATE TRIGGER `OMAR_ACTULIZACION_EXISTENCIAS` AFTER INSERT ON `omar_detalle_compra` FOR EACH ROW UPDATE omar_producto SET omar_producto.OMAR_EXITENCIAS_PRODUCTO= omar_producto.OMAR_EXITENCIAS_PRODUCTO + new.OMAR_CANTIDAD_COMPRA WHERE omar_producto.OMAR_CLAVE_PRODUCTO = new.OMAR_CLAVE_PRODUCTO
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table omar_detalle_venta
-- ----------------------------
DROP TRIGGER IF EXISTS `OMAR_ACTUALIZACION__EXISTENCIAS2`;
delimiter ;;
CREATE TRIGGER `OMAR_ACTUALIZACION__EXISTENCIAS2` AFTER INSERT ON `omar_detalle_venta` FOR EACH ROW UPDATE omar_producto SET omar_producto.OMAR_EXITENCIAS_PRODUCTO= omar_producto.OMAR_EXITENCIAS_PRODUCTO - new.OMAR_CANTIDAD_VENTA WHERE omar_producto.OMAR_CLAVE_PRODUCTO = new.OMAR_CLAVE_PRODUCTO
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table omar_marca
-- ----------------------------
DROP TRIGGER IF EXISTS `OMAR_INSERTA_MARCA`;
delimiter ;;
CREATE TRIGGER `OMAR_INSERTA_MARCA` AFTER INSERT ON `omar_marca` FOR EACH ROW INSERT omar_respaldo_tiendita.omar_bitacora VALUES (
DEFAULT, USER(), NOW(), CONCAT(new.OMAR_ID_MARCA, ',',new.OMAR_NOMBRE_MARCA, ',',new.OMAR_STATUS), '', 'omar_marca', 'Insert')
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table omar_marca
-- ----------------------------
DROP TRIGGER IF EXISTS `OMAR_ACTUALIZA_MARCA`;
delimiter ;;
CREATE TRIGGER `OMAR_ACTUALIZA_MARCA` AFTER UPDATE ON `omar_marca` FOR EACH ROW INSERT omar_respaldo_tiendita.omar_bitacora VALUES (
DEFAULT, USER(), NOW(), 
CONCAT(new.OMAR_ID_MARCA, ',',new.OMAR_NOMBRE_MARCA, ',',new.OMAR_STATUS),
CONCAT(old.OMAR_ID_MARCA, ',',old.OMAR_NOMBRE_MARCA, ',',old.OMAR_STATUS), 'omar_marca', 'UPDATE')
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table omar_marca
-- ----------------------------
DROP TRIGGER IF EXISTS `OMAR_BORRAR_MARCA`;
delimiter ;;
CREATE TRIGGER `OMAR_BORRAR_MARCA` AFTER DELETE ON `omar_marca` FOR EACH ROW INSERT omar_respaldo_tiendita.omar_bitacora VALUES (
DEFAULT, USER(), NOW(), 
'',
CONCAT(old.OMAR_ID_MARCA, ',',old.OMAR_NOMBRE_MARCA, ',',old.OMAR_STATUS), 'omar_marca', 'DELETE')
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
