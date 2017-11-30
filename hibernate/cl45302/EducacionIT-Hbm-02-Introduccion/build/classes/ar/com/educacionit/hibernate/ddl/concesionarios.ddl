CREATE TABLE `concesionarios` (
  `co_id` int(10) unsigned NOT NULL auto_increment,
  `co_nombre` varchar(255) NOT NULL default '',
  `co_direccion` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`co_id`)
) ENGINE=MyISAM;