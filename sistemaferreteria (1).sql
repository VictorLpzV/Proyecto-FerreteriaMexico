-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-06-2022 a las 05:13:24
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaferreteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `Fila` int(5) NOT NULL,
  `Id` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Tipo` varchar(128) NOT NULL,
  `Cantidad` int(10) NOT NULL,
  `Proveedor` varchar(100) NOT NULL,
  `Sucursal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Fila`, `Id`, `Nombre`, `Tipo`, `Cantidad`, `Proveedor`, `Sucursal`) VALUES
(1, 1, 'Barilla 1/4', 'Herramientas para el hogar', 40, 'TRUPPER', 'Coatzacoalcos'),
(2, 1, 'Pinzas de presión', 'Herramientas para el hogar', 1, 'HELVEX', 'Coatzacoalcos'),
(3, 2, 'Tijeras p/Lámina', 'Herramientas para el hogar', 1, 'PIMSA', 'Minatitlán'),
(4, 2, 'Lámina 7.30x26mm', 'Accesorios para jardín', 10, 'INFRA', 'Minatitlán'),
(5, 3, 'Fumigadora 10Lts', 'accesorios para jardín', 1, 'HELVEX', 'Minatitlán'),
(6, 3, 'Desarmador cruz', 'Herramientas para el hogar', 1, 'TRUPPER', 'Minatitlán');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(128) NOT NULL,
  `contrasena` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `contrasena`) VALUES
('Admin', 'Admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Fila`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `Fila` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
