-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sistema_denuncias
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sistema_denuncias` ;

-- -----------------------------------------------------
-- Schema sistema_denuncias
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistema_denuncias` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `sistema_denuncias` ;

-- -----------------------------------------------------
-- Table `sistema_denuncias`.`Localidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`Localidad` (
  `idLocalidad` INT NOT NULL AUTO_INCREMENT,
  `NombreLocalidad` VARCHAR(50) NULL,
  `Municipio` VARCHAR(30) NULL,
  `NoDistrito` INT NULL,
  PRIMARY KEY (`idLocalidad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`TipoLugar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`TipoLugar` (
  `idTipoLugar` INT NOT NULL AUTO_INCREMENT,
  `NombreTipoLugar` VARCHAR(35) NULL,
  PRIMARY KEY (`idTipoLugar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`DelitoTipo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`DelitoTipo` (
  `idDelito` INT NOT NULL AUTO_INCREMENT,
  `NombreTipoDelito` VARCHAR(35) NULL,
  PRIMARY KEY (`idDelito`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`Denuncia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`Denuncia` (
  `idDenuncia` INT NOT NULL AUTO_INCREMENT,
  `FechaHoraOcurrido` DATETIME NULL,
  `Estado` VARCHAR(20) NULL,
  `Direccion` VARCHAR(100) NULL,
  `Sintesis` VARCHAR(45) NULL,
  `CuantosFemeninos` INT NULL,
  `CuantosMasculinos` INT NULL,
  `CuantosDesconocidos` INT NULL,
  `idLocalidad` INT NULL,
  `LugarAfectado` INT NULL,
  `TipoDelito` INT NULL,
  PRIMARY KEY (`idDenuncia`),
  CONSTRAINT `fk_Denuncia_Localidad1`
    FOREIGN KEY (`idLocalidad`)
    REFERENCES `sistema_denuncias`.`Localidad` (`idLocalidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Denuncia_TipoLugar1`
    FOREIGN KEY (`LugarAfectado`)
    REFERENCES `sistema_denuncias`.`TipoLugar` (`idTipoLugar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Denuncia_DelitoTipo1`
    FOREIGN KEY (`TipoDelito`)
    REFERENCES `sistema_denuncias`.`DelitoTipo` (`idDelito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Denuncia_Localidad2`
    FOREIGN KEY (`idLocalidad`)
    REFERENCES `sistema_denuncias`.`Localidad` (`idLocalidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Denuncia_TipoLugar2`
    FOREIGN KEY (`LugarAfectado`)
    REFERENCES `sistema_denuncias`.`TipoLugar` (`idTipoLugar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Denuncia_DelitoTipo2`
    FOREIGN KEY (`TipoDelito`)
    REFERENCES `sistema_denuncias`.`DelitoTipo` (`idDelito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(60) NULL,
  `Alias` VARCHAR(25) NULL,
  `Contrasena` VARCHAR(100) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`PresuntoAutor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`PresuntoAutor` (
  `idAutor` INT NOT NULL AUTO_INCREMENT,
  `NombreAutor` VARCHAR(60) NULL,
  `Descripcion` VARCHAR(500) NULL,
  `ColorDePiel` VARCHAR(15) NULL,
  `EstaturaAprox` FLOAT NULL,
  `Cabello` VARCHAR(100) NULL,
  `Contextura` VARCHAR(15) NULL,
  `Tatuajes` VARCHAR(100) NULL,
  `Cicatrices` VARCHAR(100) NULL,
  `Sexo` VARCHAR(12) NULL,
  `AliasAutor` VARCHAR(60) NULL,
  `idDenuncia` INT NULL,
  PRIMARY KEY (`idAutor`),
  CONSTRAINT `fk_PresuntoAutor_Denuncia1`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PresuntoAutor_Denuncia2`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`ObjetoUtilizado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`ObjetoUtilizado` (
  `idObjetoUtilizado` INT NOT NULL AUTO_INCREMENT,
  `NombreUtilizado` VARCHAR(70) NULL,
  `CantidadUtilizado` INT NULL,
  `idDenuncia` INT NULL,
  PRIMARY KEY (`idObjetoUtilizado`),
  CONSTRAINT `fk_ObjetoUtilizado_Denuncia1`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ObjetoUtilizado_Denuncia2`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`ObjetoAfectado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`ObjetoAfectado` (
  `idObjetoAfectado` INT NOT NULL AUTO_INCREMENT,
  `NombreAfectado` VARCHAR(70) NULL,
  `CantidadAfectado` INT NULL,
  `idDenuncia` INT NULL,
  PRIMARY KEY (`idObjetoAfectado`),
  CONSTRAINT `fk_ObjetoAfectado_Denuncia1`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ObjetoAfectado_Denuncia2`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`Victima`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`Victima` (
  `idVictima` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(60) NULL,
  `Identificacion` VARCHAR(30) NULL,
  `Sexo` VARCHAR(12) NULL,
  `Edad` INT NULL,
  `idDenuncia` INT NULL,
  PRIMARY KEY (`idVictima`),
  CONSTRAINT `fk_Victima_Denuncia1`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Victima_Denuncia2`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_denuncias`.`Testigo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_denuncias`.`Testigo` (
  `idTestigo` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(60) NULL,
  `Identificacion` VARCHAR(30) NULL,
  `Sexo` VARCHAR(12) NULL,
  `Edad` INT NULL,
  `idDenuncia` INT NULL,
  PRIMARY KEY (`idTestigo`),
  CONSTRAINT `fk_Testigo_Denuncia1`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Testigo_Denuncia2`
    FOREIGN KEY (`idDenuncia`)
    REFERENCES `sistema_denuncias`.`Denuncia` (`idDenuncia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
