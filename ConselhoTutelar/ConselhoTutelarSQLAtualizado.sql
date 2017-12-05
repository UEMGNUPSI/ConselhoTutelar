-- MySQL Script generated by MySQL Workbench
-- 11/28/17 16:30:25
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ConselhoTutelar
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ConselhoTutelar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ConselhoTutelar` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `ConselhoTutelar` ;

-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Conselheiro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Conselheiro` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NULL,
  `Telefone` VARCHAR(15) NULL,
  `Celular` VARCHAR(15) NULL,
  `Login` VARCHAR(25) NULL,
  `Senha` VARCHAR(25) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Direitos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Direitos` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Numero` VARCHAR(10) NULL,
  `Descricao` VARCHAR(100) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Requerente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Requerente` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(50) NULL,
  `Nascimento`VARCHAR(12) NULL,
  `Telefone1` VARCHAR(15) NULL,
  `Telefone2` VARCHAR(15) NULL,
  `Celular` VARCHAR(15) NULL,
  `Endereco` VARCHAR(45) NULL,
  `Numero` VARCHAR(10) NULL,
  `Bairro` VARCHAR(45) NULL,
  `Cidade` VARCHAR(20) NULL,
  `Estado` VARCHAR(15) NULL,
  `EstadoCivil` VARCHAR(15) NULL,
  `Observacao` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Atendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Atendimento` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Data` VARCHAR(11) NULL,
  `RelatoResumido` VARCHAR(200) NULL,
  `Requerente_ID` INT NOT NULL,
  `Conselheiro1_ID` INT NOT NULL,
  `Conselheiro2_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Atendimento_Requerente_idx` (`Requerente_ID` ASC),
  INDEX `fk_Atendimento_Conselheiro1_idx` (`Conselheiro1_ID` ASC),
  INDEX `fk_Atendimento_Conselheiro2_idx` (`Conselheiro2_ID` ASC),
  CONSTRAINT `fk_Atendimento_Requerente`
    FOREIGN KEY (`Requerente_ID`)
    REFERENCES `ConselhoTutelar`.`Requerente` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Atendimento_Conselheiro1`
    FOREIGN KEY (`Conselheiro1_ID`)
    REFERENCES `ConselhoTutelar`.`Conselheiro` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Atendimento_Conselheiro2`
    FOREIGN KEY (`Conselheiro2_ID`)
    REFERENCES `ConselhoTutelar`.`Conselheiro` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Crianca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Crianca` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NULL,
  `DataNascimento` VARCHAR(11) NULL,
  `Endereco` VARCHAR(45) NULL,
  `Numero` VARCHAR(45) NULL,
  `Bairro` VARCHAR(45) NULL,
  `Telefone` VARCHAR(15) NULL,
  `Atendimento_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Atendimento_ID`),
  INDEX `fk_Crianca_Atendimento1_idx` (`Atendimento_ID` ASC),
  CONSTRAINT `fk_Crianca_Atendimento1`
    FOREIGN KEY (`Atendimento_ID`)
    REFERENCES `ConselhoTutelar`.`Atendimento` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`NucleoFamiliar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`NucleoFamiliar` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NULL,
  `Parentesco` VARCHAR(45) NULL,
  `Endereco` VARCHAR(45) NULL,
  `Numero` VARCHAR(45) NULL,
  `Bairro` VARCHAR(45) NULL,
  `Telefone` VARCHAR(15) NULL,
  `Celular` VARCHAR(45) NULL,
  `Responsabilidade` VARCHAR(45) NULL,
  `Atendimento_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `Atendimento_ID`),
  INDEX `fk_NucleoFamiliar_Atendimento1_idx` (`Atendimento_ID` ASC),
  CONSTRAINT `fk_NucleoFamiliar_Atendimento1`
    FOREIGN KEY (`Atendimento_ID`)
    REFERENCES `ConselhoTutelar`.`Atendimento` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Acompanhante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Acompanhante` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(45) NULL,
  `Telefone` VARCHAR(15) NULL,
  `Endereço` VARCHAR(45) NULL,
  `Numero` VARCHAR(45) NULL,
  `Bairro` VARCHAR(45) NULL,
  `Cidade` VARCHAR(45) NULL,
  `Estado` VARCHAR(45) NULL,
  `Atendimento_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Acompanhante_Atendimento1_idx` (`Atendimento_ID` ASC),
  CONSTRAINT `fk_Acompanhante_Atendimento1`
    FOREIGN KEY (`Atendimento_ID`)
    REFERENCES `ConselhoTutelar`.`Atendimento` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ConselhoTutelar`.`Atendimento_has_Direitos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ConselhoTutelar`.`Atendimento_has_Direitos` (
  `Atendimento_ID` INT NOT NULL,
  `Direitos_ID` INT NOT NULL,
  PRIMARY KEY (`Atendimento_ID`, `Direitos_ID`),
  INDEX `fk_Atendimento_has_Direitos_Direitos1_idx` (`Direitos_ID` ASC),
  INDEX `fk_Atendimento_has_Direitos_Atendimento1_idx` (`Atendimento_ID` ASC),
  CONSTRAINT `fk_Atendimento_has_Direitos_Atendimento1`
    FOREIGN KEY (`Atendimento_ID`)
    REFERENCES `ConselhoTutelar`.`Atendimento` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Atendimento_has_Direitos_Direitos1`
    FOREIGN KEY (`Direitos_ID`)
    REFERENCES `ConselhoTutelar`.`Direitos` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

insert into conselheiro values (1, "Fernando", "000", "000", "root", "root");

use conselhotutelar;
select * from nucleofamiliar;

