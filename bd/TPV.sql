/*
 Navicat Premium Data Transfer

 Source Server         : nuevoXammp
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost
 Source Database       : TPV

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : utf-8

 Date: 04/15/2018 21:03:16 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `caja`
-- ----------------------------
DROP TABLE IF EXISTS `caja`;
CREATE TABLE `caja` (
  `id_caja` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'toda la informacion se genera automaticamente',
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `cliente` bigint(20) DEFAULT NULL,
  `usuario` bigint(20) DEFAULT NULL,
  `estacion` bigint(20) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `iva_importe` double DEFAULT NULL,
  `ieps_importe` double DEFAULT NULL,
  `total_importe` double DEFAULT NULL,
  `comision` double DEFAULT NULL,
  `iva_comision` double DEFAULT NULL,
  `total_comision` double DEFAULT NULL,
  `importe_global` double DEFAULT NULL,
  `corte` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_caja`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `categoria`
-- ----------------------------
DROP TABLE IF EXISTS `categoria`;
CREATE TABLE `categoria` (
  `id_categoria` bigint(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL COMMENT 'si',
  `descripcion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `categoria`
-- ----------------------------
BEGIN;
INSERT INTO `categoria` VALUES ('1', 'categoriaUno', 'categoriaUno'), ('2', 'categoriaDos', 'categoriaDos'), ('3', 'categoriaTres', 'categoriaTres');
COMMIT;

-- ----------------------------
--  Table structure for `clientes`
-- ----------------------------
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `id_cliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(70) NOT NULL,
  `rfc` varchar(20) NOT NULL,
  `d_calle` varchar(30) NOT NULL,
  `d_numero_ext` varchar(5) NOT NULL,
  `d_numero_int` varchar(5) NOT NULL,
  `d_colonia` varchar(30) NOT NULL,
  `d_municipio` varchar(30) NOT NULL,
  `d_ciudad` varchar(30) NOT NULL,
  `d_estado` varchar(30) NOT NULL,
  `d_cp` varchar(10) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `celular` varchar(12) NOT NULL,
  `e-mail` varchar(30) NOT NULL,
  `credito` double NOT NULL,
  `saldo` double DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `estacion`
-- ----------------------------
DROP TABLE IF EXISTS `estacion`;
CREATE TABLE `estacion` (
  `id_estaciones` bigint(11) NOT NULL AUTO_INCREMENT,
  `nombre_estacion` varchar(20) NOT NULL,
  `volumen_HHD` varchar(60) DEFAULT NULL,
  `modulos_01` tinyint(4) DEFAULT NULL,
  `modulos_02` tinyint(4) DEFAULT NULL,
  `modulos_03` tinyint(4) DEFAULT NULL,
  `modulos_04` tinyint(4) DEFAULT NULL,
  `modulos_05` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_estaciones`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `movimientos`
-- ----------------------------
DROP TABLE IF EXISTS `movimientos`;
CREATE TABLE `movimientos` (
  `id_movimiento` bigint(11) NOT NULL AUTO_INCREMENT,
  `caja` bigint(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `producto` bigint(11) DEFAULT NULL,
  `cantidad_venta` double DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `iva_importe` double DEFAULT NULL,
  `ieps_importe` double DEFAULT NULL,
  `total_importe_unidad` double DEFAULT NULL,
  `venta` double DEFAULT NULL,
  `iva_venta` double DEFAULT NULL,
  `ieps_venta` double DEFAULT NULL,
  `total_venta` double DEFAULT NULL,
  `utilidad` double DEFAULT NULL,
  `log_existencia` double DEFAULT NULL,
  PRIMARY KEY (`id_movimiento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `producto`
-- ----------------------------
DROP TABLE IF EXISTS `producto`;
CREATE TABLE `producto` (
  `id_producto` bigint(11) NOT NULL AUTO_INCREMENT,
  `clave` varchar(6) NOT NULL COMMENT 'si',
  `sku` varchar(20) DEFAULT NULL COMMENT 'si puede quedar nulo',
  `sku_vnpk` varchar(20) DEFAULT NULL COMMENT 'si puede quedar vacio, pero solo es para PRO',
  `provedor` bigint(11) NOT NULL COMMENT 'si, es combobox',
  `categoria` bigint(11) NOT NULL COMMENT 'si, combobox',
  `descripcion` varchar(40) NOT NULL COMMENT 'si, texto',
  `descripcion_e` varchar(120) DEFAULT NULL COMMENT 'version PRO, puede quedar null',
  `costo` double NOT NULL COMMENT 'si',
  `iva_costo` double NOT NULL COMMENT 'si',
  `ieps_costo` double NOT NULL COMMENT 'si',
  `total_costo` double NOT NULL COMMENT 'si',
  `precio_may` double DEFAULT NULL COMMENT 'version PRO pueden quedar null',
  `iva_precio_may` double DEFAULT NULL COMMENT 'pro',
  `ieps_precio_may` double DEFAULT NULL COMMENT 'pro',
  `total_precio_may` double DEFAULT NULL COMMENT 'pro',
  `precio_mm` double DEFAULT NULL COMMENT 'pro',
  `iva_precio_mm` double DEFAULT NULL COMMENT 'pro',
  `ieps_precio_mm` double DEFAULT NULL COMMENT 'pro',
  `total_precio_mm` double DEFAULT NULL COMMENT 'pro',
  `precio_retail` double NOT NULL COMMENT 'si',
  `iva_precio_retail` double NOT NULL COMMENT 'si',
  `ieps_precio_retail` double NOT NULL COMMENT 'si',
  `total_precio_retail` double NOT NULL COMMENT 'si',
  `existencia` double NOT NULL COMMENT 'si',
  `activo_inactivo` binary(50) NOT NULL COMMENT 'es solo para llenado de nosotros, es para cuando se elimina un producto',
  `unidad_medida` bigint(20) NOT NULL COMMENT 'si, es un combo',
  PRIMARY KEY (`id_producto`),
  KEY `categoria` (`categoria`),
  KEY `producto_provedor_fk` (`provedor`),
  KEY `unidad_medida` (`unidad_medida`),
  CONSTRAINT `prodcuto_categoria_fk` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_producto_af` FOREIGN KEY (`id_producto`) REFERENCES `producto_af` (`id_producto_af`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_producto_ee_fk` FOREIGN KEY (`id_producto`) REFERENCES `producto_ee` (`id_producto_ee`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_provedor_fk` FOREIGN KEY (`provedor`) REFERENCES `provedor` (`id_provedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `producto_unidad_medida_fk` FOREIGN KEY (`unidad_medida`) REFERENCES `unidad_medida` (`id_unidad_medida`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `producto_af`
-- ----------------------------
DROP TABLE IF EXISTS `producto_af`;
CREATE TABLE `producto_af` (
  `id_producto_af` bigint(11) NOT NULL AUTO_INCREMENT,
  `nombre_pack_uno` varchar(15) DEFAULT NULL COMMENT 'nombre de la unidad minima, version PRO',
  `cantidad_pack_uno` double NOT NULL COMMENT 'siempre sera la unidad minima, version PRO',
  `nombre_pack_dos` varchar(15) DEFAULT NULL COMMENT 'version PRO',
  `cantidad_pack_dos` double DEFAULT NULL COMMENT 'version PRO',
  `nombre_pack_tres` varchar(15) DEFAULT NULL COMMENT 'version PRO',
  `cantidad_pack_tres` double DEFAULT NULL COMMENT 'version PRO',
  `peso_pack_uno` double DEFAULT NULL COMMENT 'version PRO',
  PRIMARY KEY (`id_producto_af`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `producto_ee`
-- ----------------------------
DROP TABLE IF EXISTS `producto_ee`;
CREATE TABLE `producto_ee` (
  `id_producto_ee` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'producto existencia extendida',
  `existencia_uno` double DEFAULT NULL COMMENT 'existencia adicional a existencia principal, solo para unida de medida mixto',
  `existencia_dos` double DEFAULT NULL COMMENT 'existencia adicional a existencia principal, solo para unida de medida mixto',
  `existencia_tres` double DEFAULT NULL COMMENT 'existencia adicional a existencia principal, solo para unida de medida mixto',
  PRIMARY KEY (`id_producto_ee`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `provedor`
-- ----------------------------
DROP TABLE IF EXISTS `provedor`;
CREATE TABLE `provedor` (
  `id_provedor` bigint(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `razon_social` varchar(40) NOT NULL,
  `rfc` varchar(20) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `contacto` varchar(40) NOT NULL,
  PRIMARY KEY (`id_provedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `provedor`
-- ----------------------------
BEGIN;
INSERT INTO `provedor` VALUES ('1', 'coca', 'coca', '876987', 'aqui mero', '23424234', '23423423'), ('2', 'bimbo', 'bimbo mx', '234234', 'tambien por aqui', '234234234', '123131323'), ('3', 'alpura', 'alpura', '87686', 'melchor ocampo', '234242', 'alpurapoipoip');
COMMIT;

-- ----------------------------
--  Table structure for `unidad_medida`
-- ----------------------------
DROP TABLE IF EXISTS `unidad_medida`;
CREATE TABLE `unidad_medida` (
  `id_unidad_medida` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `descripcion` varchar(40) NOT NULL,
  `valor_decimal` tinyint(50) NOT NULL COMMENT 'control de nosotros',
  PRIMARY KEY (`id_unidad_medida`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `unidad_medida`
-- ----------------------------
BEGIN;
INSERT INTO `unidad_medida` VALUES ('1', 'KILO', 'ES UN KILO', '1'), ('2', 'LITRO', 'ES UN LITRO', '1'), ('3', 'prueba1', 'prueba1', '1'), ('4', 'uno', 'uno', '1'), ('5', 'dos', 'dos', '1'), ('6', 'codos', 'codos', '1');
COMMIT;

-- ----------------------------
--  Table structure for `usuario`
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` bigint(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) DEFAULT NULL,
  `nombre_corto` varchar(10) DEFAULT NULL,
  `modulo_01` tinyint(4) DEFAULT NULL,
  `modulo_02` tinyint(4) DEFAULT NULL,
  `modulo_03` tinyint(4) DEFAULT NULL,
  `modulo_04` tinyint(4) DEFAULT NULL,
  `modulo_05` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
