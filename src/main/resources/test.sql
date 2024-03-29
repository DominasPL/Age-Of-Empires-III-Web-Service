INSERT INTO statuses (is_active)
VALUES (1), (0);

INSERT INTO ages (age_name, status_id)
VALUES ('I', 1), ('II', 1), ('III', 1), ('IV', 1), ('V', 1), ('Revolution', 1);

INSERT INTO types (type_name, status_id)
VALUES
('Infantry', 1),
('Heavy Infantry', 1),
('Ranged Infantry', 1),
('Gunpowder Infantry', 1),
('Archer', 1),
('Native Warroior', 1),
('Cavalry', 1),
('Heavy Cavlary', 1),
('Melee Cavlary', 1),
('Melee Infantry', 1),
('Military', 1),
('Pet', 1),
('Villager', 1),
('Light Cavlary', 1),
('Ranged Cavlary', 1),
('Gunpowder Cavlary', 1),
('Siege Unit', 1),
('Artillery', 1),
('Ship', 1),
('Warship', 1),
('Hero', 1),
('Light Infantry', 1),
('Wagon', 1);

INSERT INTO civilizations (civilization_name, status_id)
VALUES ('British', 1), ('Dutch', 1), ('French', 1), ('Germans', 1), ('Ottomans', 1), ('Portuguese', 1), ('Russians', 1), ('Spanish', 1),
       ('Chinese', 1) , ('Indians', 1) , ('Japanese', 1), ('Iroquois', 1), ('Sioux', 1), ('Aztecs', 1);


INSERT INTO statistics (stats_id, hit_points, resistance, speed, line_of_sight, population, xp_train_bounty, xp_bounty)
VALUES
(1, 170, '20% vs Melee', 4.5, 16, 1, 12, 12),
(2, 500,'10% vs Range',4.5,16,1,NULL,NULL),
(3, 500,'10% vs Melee',4,12,1,NULL,NULL),
(4, 105,'50% vs Ranged',4.5,22,1,12,12),
(5, 100,'20% vs Ranged',4.0,20,1,8,8),
(6, 230,'20% vs Melee',4.5,12,2,20,20),
(7, 115,'30% vs Ranged',4,24,1,12,12),
(8, 200,'10% vs Melee',4,12,1,12,12),
(9, 235,'20% vs Melee',4,16,1,13,13),
(10, 95,'30% vs Ranged',4,24,1,10,10),
(11, 150,'20% vs Melee',4,16,1,10,10),
(12, 120,'10% vs Melee',5,12,1,4,8),
(13, 150,'20% vs Melee',5,12,1,14,14),
(14, 135,'40% vs Melee',6,12,1,10,10),
(15, 230,'30% vs Melee',4.5,12,2,20,20),
(16, 190,'20% vs Melee',4,16,1,12,12),
(17, 120,'30% vs Ranged',4,24,1,12,12),
(18, 72,'30% vs Ranged',4.5,16,1,6,6),
(19, 100,'30% vs Ranged',4,22,1,11,11),
(20, 175,'30% vs Melee',5,12,6,20,20),
(21, 265,'30% vs Melee',6.75,14,2,16,16),
(22, 225,'30% vs Ranged',6.75,16,1,15,15),
(23, 500,'20% vs Ranged',6.25,15,3,30,30),
(24, 200,'30% vs Ranged',7.25,15,2,18,18),
(25, 320,'20% vs Ranged',6.75,15,2,20,20),
(26, 350,'30% vs Ranged',6.5,15,2,20,20),
(27, 300,'30% vs Ranged',6.8,15,2,20,20),
(28, 250,'20% vs Ranged',6.75,15,2,15,15),
(29, 140,'10% vs Ranged',7.25,14,1,11,11),
(30, 190,'30% vs Ranged',6.75,12,2,15,15),
(31, 500,'20% vs Melee',6,22,3,30,30),
(32, 200,'50% vs Ranged',6.8,22,2,21,21),
(33, 130,'20% vs Ranged',4,22,2,15,15),
(34, 280,'75% vs Ranged',3.5,36,4,50,50),
(35, 200,'75% vs Ranged',4.0,30,5,50,50),
(36, 150,'75% vs Ranged',4,26,4,40,40),
(37, 200,'50% vs Ranged',4,15,2,18,18),
(38, 200,'20% vs Melee',4,15,2,18,18),
(39, 200,'75% vs Ranged',6,30,6,60,60),
(40, 300,'75% vs Ranged',3,44,4,45,45),
(41, 150,'75% vs Ranged',4,30,4,40,40),
(42, 225,'40% vs Ranged',4,15,1,15,15),
(43, 2000,'75% vs Ranged',7.5,24,0,60,60),
(44, 220,'50% vs Ranged',8.5,24,0,10,10),
(45, 800,'50% vs Ranged',8.5,26,0,40,40),
(46, 400,'50% vs Ranged',9,40,0,20,20),
(47, 200,'50% vs Ranged',4,10,1,10,10),
(48, 1000,'75% vs Ranged',8.5,26,0,60,60),
(49, 2000,'75% vs Ranged',7.5,34,0,100,100),
(50, 2500,'75% vs Ranged',7.5,34,0,120,120),
(51, 800,'50% vs Ranged',9,26,0,40,40),
(52, 1500,'75% vs Ranged',8.5,26,0,80,80),
(53, 600,'60% vs Ranged',10,26,0,40,40),
(54, 2000,'75% vs Ranged',7.5,34,0,NULL,100),
(55, 220,'50% vs Ranged',8.5,24,0,10,10),
(56, 1200,'50% vs Ranged',6.5,38,0,100,100),
(57, 2000,'75% vs Ranged',7.5,34,0,100,100),
(58, 800,'50% vs Ranged',8.5,26,0,40,40),
(59, 1500,'75% vs Ranged',7.5,38,0,80,80),
(60, 475,'75% vs Ranged',3.5,32,7,70,70),
(61, 475,'75% vs Ranged',3.5,32,7,70,70),
(62, 350,'75% vs Ranged',4,32,6,60,60),
(63, 150,'20% vs Melee',4,14,1,5,10),
(64, 200,'10% vs Ranged',4,26,0,5,5),
(65, 200,'20% vs Melee',4,14,1,0,NULL),
(66, 120,'10% vs Ranged',5.5,22,1,0,14),
(67, 180,'40% vs Ranged',4.5,18,1,12,12),
(68, 400,'10% vs Ranged',4.5,18,0,NULL,45),
(69, 360,'10% vs Ranged',4,12,1,20,20),
(70, 300,'10% vs Ranged',7,12,1,20,20),
(71, 360,'10% vs Ranged',4,12,1,20,20),
(72, 150,'20% vs Ranged',6.25,28,2,20,20),
(73, 240,'10% vs Ranged',4,12,1,30,30),
(80, 225,'30% vs Ranged',7.5,20,2,16,16),
(81, 120,'30% vs Ranged',7.5,15,1,12,12),
(82, 917,'30% vs Ranged',6,15,7,65,65),
(83, 667,'20% vs Ranged',5.5,20,6,60,60),
(85, 325,'50% vs Ranged',4,15,4,30,30),
(86, 210,'64% vs Ranged',4.25,14,4,34,34),
(87, 175,'75% vs Ranged',3,34,4,40,40),
(88, 100,'50% vs Ranged',3,38,1,14,14),
(90, 225,'75% vs Ranged',2.5,44,3,35,35),
(91, 700,'30% vs Ranged',4,29,7,70,70),
(92, 130,'20% vs Melee',4,15,1,NULL,NULL),
(93, 120,'10% vs Melee',5,12,1,NULL,NULL),
(94, 150,'20% vs Melee',4,14,1,10,10),
(101, 160,'10% vs Ranged',4.5,12,0,10,10),
(102, 400,'40% vs Ranged',5.0,12,0,20,20),
(103, 240,'0',3,38,0,NULL,NULL),
(104, 45,'0',4,14,2,NULL,NULL),
(105, 90,'10% vs Melee',5,14,0,10,10),
(106, 200,'30% vs Melee',5,18,1,12,12),
(107, 750,'75% vs Ranged',9,34,0,50,50),
(108, 110,'30% vs Ranged',5,20,1,10,10),
(109, 90,'30% vs Ranged',4,22,1,10,10),
(110, 150,'10% vs Ranged',6.25,12,1,11,11),
(111, 110,'30% vs Ranged',4,24,1,12,12),
(112, 80,'30% vs Ranged',4.5,20,1,7,7),
(113, 135,'20% vs Melee',5,12,1,10,10),
(114, 150,'20% vs Melee',4,16,1,10,10),
(115, 85,'30% vs Ranged',4,24,1,9,9),
(116, 120,'20% vs Melee',5,12,1,9,9),
(117, 150,'75% vs Ranged',3,36,4,40,40),
(118, 400,'50% vs Ranged',3.5,18,2,20,20),
(119, 200,'50% vs Ranged',3.5,15,2,20,20),
(120, 150,'40% vs Ranged',3.75,32,2,11,11),
(121, 180,'30% vs Ranged',6,18,1,15,15),
(122, 230,'10% vs Melee',4.5,12,1,15,15),
(123, 250,'20% vs Ranged',6.75,12,2,20,20),
(124, 250,'30% vs Melee',6.75,14,2,18,18),
(125, 285,'30% vs Ranged',6.75,15,2,18,18),
(126, 205,'30% vs Ranged',7.25,15,2,16,16),
(127, 205,'30% vs Melee',6.75,15,2,22,22),
(128, 170,'10% vs Ranged',6.75,12,2,23,23),
(129, 550,'30% vs Ranged',6.75,12,3,NULL,30),
(130, 360,'10% vs Ranged',4,12,1,NULL,20),
(131, 300,'20% vs Melee',4,12,2,NULL,25),
(132, 150,'20% vs Siege',4,8,0,NULL,15),
(133, 200,'20% vs Melee',4,15,1,NULL,NULL),
(134, 360,'10% vs Ranged',4,12,1,NULL,20),
(135, 225,'75% vs Ranged',3,32,7,NULL,60),
(136, 300,'20% vs Melee',5.5,12,2,28,28),
(137, 380,'20% vs Melee',4,16,2,24,24),
(138, 230,'30% vs Ranged',4,24,2,24,24),
(139, 450,'30% vs Ranged',7.5,20,4,32,32),
(140, 240,'30% vs Ranged',7.5,15,2,24,24),
(141, 917,'30% vs Ranged',6,15,7,65,65),
(142, 1600,'20% vs Ranged',5.5,24,12,120,120),
(143, 1400,'30% vs Ranged',4,29,14,140,140),
(144, 650,'50% vs Ranged',4,15,8,60,60),
(145, 250,'50% vs Ranged',4,15,2,30,30),
(146, 315,'40% vs Melee',6,12,2,20,20),
(147, 520,'40% vs Melee',7.25,15,3,27,27),
(148, 225,'30% vs Ranged',7.25,16,7,24,24),
(149, 140,'30% vs Melee',4.5,16,5,18,18),
(150, 1000,'30% vs Ranged',6,12,4,40,40),
(151, 300,'10% vs Melee',5.5,16,2,30,30),
(152, 295,'30% vs Ranged',6.75,15,3,30,30),
(153, 400,'40% vs Melee',4,16,2,20,20),
(154, 225,'60% vs Ranged',4.5,20,2,20,20),
(155, 250,'40% vs Ranged',5,24,2,18,18),
(156, 600,'40% vs Ranged',7.5,15,4,40,40),
(157, 430,'30% vs Melee',4,12,2,24,24),
(158, 600,'75% vs Ranged',2.5,32,8,120,120),
(159, 1450,'40% vs Ranged',6.5,15,4,40,40),
(160, 400,'40% vs Melee',7.25,14,2,22,22),
(161, 400,'30% vs Melee',6,12,4,20,20),
(162, 150,'30% vs Melee',4.5,16,5,16,16),
(163, 110,'30% vs Ranged',4,22,6,18,18),
(164, 540,'40% vs Melee',4.5,12,4,40,40),
(165, 585,'30% vs Ranged',7.25,15,3,30,30),
(166, 325,'30% vs Melee',5,12,2,16,16),
(167, 210,'30% vs Ranged',4,22,6,30,30),
(168, 250,'20% vs Ranged',6.5,15,5,24,24),
(169, 120,'30% vs Ranged',4,20,3,24,24),
(170, 165,'30% vs Melee',5,12,4,23,23),
(171, 400,'30% vs Melee',4.5,12,3,20,20),
(172, 650,'30% vs Ranged',6.5,12,4,35,35),
(173, 650,'30% vs Ranged',6.5,12,4,35,35),
(174, 650,'30% vs Ranged',6.5,12,4,35,35),
(175, 1500,'30% vs Ranged',6.5,12,4,35,35),
(176, 540,'40% vs Melee',6.8,20,4,40,40),
(177, 200,'30% vs Ranged',7.25,15,0,18,18),
(178, 160,'10% vs Ranged',4.5,12,0,10,10),
(179, 165,'50% vs Ranged',4.5,14,0,15,15),
(180, 230,'10% vs Ranged',4,18,0,12,12),
(181, 300,'10% vs Ranged',6.8,12,0,15,15),
(182, 200,'10% vs Melee',7.25,16,0,15,15),
(183, 180,'30% vs Ranged',7.3,15,0,16,16),
(184, 300,'10% vs Ranged',4,20,0,12,12),
(185, 180,'40% vs Ranged',4.5,18,1,12,12),
(186, 250,'40% vs Ranged',3.5,12,0,15,15),
(187, 200,'10% vs Ranged',4.5,14,0,10,10),
(188, 170,'20% vs Melee',5,12,0,12,12),
(189, 230,'10% vs Ranged',4,18,0,12,12),
(190, 165,'10% vs Melee',5,12,0,10,10),
(191, 180,'10% vs Melee',5,12,0,10,10),
(192, 200,'10% vs Ranged',5,14,0,10,10),
(193, 200,'10% vs Melee',5,12,0,10,10),
(194, 185,'20% vs Ranged',6.3,12,0,11,11),
(195, 115,'20% vs Ranged',4.5,12,0,10,10),
(196, 140,'20% vs Melee',5,12,0,10,10),
(197, 150,'20% vs Ranged',6,12,0,11,11),
(198, 80,'10% vs Melee',4,20,0,10,10),
(199, 425,'30% vs Ranged',6,15,0,28,28),
(200, 210,'10% vs Melee',4.5,12,0,10,10),
(201, 400,'50% vs Ranged',9,34,0,25,25);


INSERT INTO units_informations (age_id, stats_id)
VALUES
(2, 1),
(NULL, 2),
(NULL, 3),
(3, 4),
(2, 5),
(2, 6),
(2, 7),
(3, 8),
(2, 9),
(2, 10),
(2, 11),
(2, 12),
(2, 13),
(2, 14),
(2, 15),
(2, 16),
(3, 17),
(2, 18),
(2, 19),
(2, 20),
(3, 21),
(2, 22),
(3, 23),
(3, 24),
(2, 25),
(3, 26),
(2, 27),
(3, 28),
(3, 29),
(2, 30),
(3, 31),
(3, 32),
(2, 33),
(3, 34),
(3, 35),
(6, 36),
(2, 37),
(3, 38),
(3, 39),
(4, 40),
(3, 41),
(3, 42),
(2, 43),
(2, 44),
(2, 45),
(2, 46),
(1, 47),
(2, 48),
(3, 49),
(3, 50),
(2, 51),
(2, 52),
(2, 53),
(6, 54),
(2, 55),
(4, 56),
(3, 57),
(2, 58),
(2, 59),
(4, 60),
(4, 61),
(4, 62),
(1, 63),
(1, 64),
(1, 65),
(1, 66),
(1, 67),
(1, 68),
(1, 69),
(1, 70),
(1, 71),
(2, 72),
(2, 73),
(2, NULL),
(2, NULL),
(2, NULL),
(3, NULL),
(3, NULL),
(3, NULL),
(2, 80),
(2, 81),
(3, 82),
(3, 83),
(3, NULL),
(2, 85),
(2, 86),
(3, 87),
(3, 88),
(3, NULL),
(4, 90),
(3, 91),
(1, 92),
(1, 93),
(1, 94),
(1, NULL),
(1, NULL),
(1, NULL),
(1, NULL),
(NULL, NULL),
(1, NULL),
(2, 101),
(2, 102),
(2, 103),
(NULL, 104),
(1, 105),
(6, 106),
(4, 107),
(2, 108),
(2, 109),
(2, 110),
(3, 111),
(2, 112),
(2, 113),
(2, 114),
(3, 115),
(2, 116),
(4, 117),
(3, 118),
(3, 119),
(3, 120),
(3, 121),
(3, 122),
(2, 123),
(2, 124),
(2, 125),
(3, 126),
(3, 127),
(3, 128),
(4, 129),
(2, 130),
(4, 131),
(1, 132),
(1, 133),
(2, 134),
(2, 135),
(2, 136),
(2, 137),
(2, 138),
(2, 139),
(2, 140),
(3, 141),
(3, 142),
(3, 143),
(2, 144),
(3, 145),
(3, 146),
(3, 147),
(2, 148),
(NULL, 149),
(3, 150),
(3, 151),
(3, 152),
(3, 153),
(3, 154),
(3, 155),
(3, 156),
(3, 157),
(4, 158),
(4, 159),
(3, 160),
(3, 161),
(2, 162),
(NULL, 163),
(NULL, 164),
(3, 165),
(3, 166),
(3, 167),
(NULL, 168),
(NULL, 169),
(NULL, 170),
(NULL, 171),
(2, 172),
(2, 173),
(2, 174),
(4, 175),
(2, 176),
(2, 177),
(2, 178),
(2, 179),
(2, 180),
(2, 181),
(2, 182),
(2, 183),
(2, 184),
(2, 185),
(2, 186),
(2, 187),
(2, 188),
(2, 189),
(2, 190),
(2, 191),
(2, 192),
(2, 193),
(2, 194),
(2, 195),
(2, 196),
(2, 197),
(2, 198),
(2, 199),
(2, 200),
(3, 201);

INSERT INTO units (unit_name, unit_information_id, status_id)
VALUES ('Ashigaru Musketeer', 1, 1),
       ('Boneguard Musketeer', 2, 1),
       ('Boneguard Swordsman', 3, 1),
       ('Cassador', 4, 1),
       ('Crossbowman', 5, 1),
       ('Doppelsoldner', 6, 1),
       ('Gurkha', 7, 1),
       ('Halberdier', 8, 1),
       ('Janissary', 9, 1),
       ('Longbowman', 10, 1),
       ('Musketeer', 11, 1),
       ('Pikeman', 12, 1),
       ('Rajput', 13, 1),
       ('Rodelero', 14, 1),
       ('Samurai', 15, 1),
       ('Sepoy', 16, 1),
       ('Skirmisher', 17, 1),
       ('Strelet', 18, 1),
       ('Yumi Archer', 19, 1),
       ('Pirate', 20, 1),
       ('Cavalry Archer', 21, 1),
       ('Cossack', 22, 1),
       ('Cuirassier', 23, 1),
       ('Dragoon', 24, 1),
       ('Hussar', 25, 1),
       ('Lancer', 26, 1),
       ('Naginata Rider', 27, 1),
       ('Oprichnik', 28, 1),
       ('Ruyter', 29, 1),
       ('Uhlan', 30, 1),
       ('War Wagon', 31, 1),
       ('Yabusame', 32, 1),
       ('Abus Gun', 33, 1),
       ('Culverin', 34, 1),
       ('Falconet', 35, 1),
       ('Gatling Gun', 36, 1),
       ('Grenadier', 37, 1),
       ('Hoop Thrower', 38, 1),
       ('Horse Artillery', 39, 1),
       ('Mortar', 40, 1),
       ('Organ Gun', 41, 1),
       ('Petard', 42, 1),
       ('Atakabune', 43, 1),
       ('Canoe', 44, 1),
       ('Caravel', 45, 1),
       ('Fire Junk', 46, 1),
       ('Fishing Boat', 47, 1),
       ('Fluyt', 48, 1),
       ('Frigate', 49, 1),
       ('Fuchuan', 50, 1),
       ('Fune', 51, 1),
       ('Galleon', 52, 1),
       ('Galley', 53, 1),
       ('Ironclad', 54, 1),
       ('Marathan Catamaran', 55, 1),
       ('Monitor', 56, 1),
       ('Tekkousen', 57, 1),
       ('War Junk', 58, 1),
       ('Wokou Junk', 59, 1),
       ('Great Bombard', 60, 1),
       ('Heavy Cannon', 61, 1),
       ('Rocket', 62, 1),
       ('Settler', 63, 1),
       ('Envoy', 64, 1),
       ('Minuteman', 65, 1),
       ('Native Scout', 66, 1),
       ('Coureur des Bois', 67, 1),
       ('Explorer', 68, 1),
       ('Imam', 69, 1),
       ('Missionary', 70, 1),
       ('Priest', 71, 1),
       ('Spy', 72, 1),
       ('Surgeon', 73, 1),
       ('Old Han Army', 74, 1),
       ('Standard Army', 75, 1),
       ('Ming Army', 76, 1),
       ('Territorial Army', 77, 1),
       ('Forbidden Army', 78, 1),
       ('Imperial Army', 79, 1),
       ('Sowar', 80, 1),
       ('Zamburak', 81, 1),
       ('Mahout Lancer', 82, 1),
       ('Howdah', 83, 1),
       ('Black Flag Army', 84, 1),
       ('Flail Elephant', 85, 1),
       ('Flamethrower', 86, 1),
       ('Flaming Arrow', 87, 1),
       ('Hand Mortar', 88, 1),
       ('Mongolian Army', 89, 1),
       ('Morutaru', 90, 1),
       ('Siege Elephant', 91, 1),
       ('Irregular', 92, 1),
       ('Sentry', 93, 1),
       ('Villager', 94, 1),
       ('Cow', 95, 1),
       ('Llama', 96, 1),
       ('Sheep', 97, 1),
       ('Goat', 98, 1),
       ('Water Buffalo', 99, 1),
       ('Sacred Cow', 100, 1),
       ('Carib Blowgun Ambusher', 101, 1),
       ('Nootka War Chief', 102, 1),
       ('Hot Air Balloons', 103, 1),
       ('War Dogs', 104, 1),
       ('Buttercup, the Pet Cougar', 105, 1),
       ('Colonial Militia', 106, 1),
       ('Tlaloc Canoe', 107, 1),
       ('Aenna', 108, 1),
       ('Cetan Bow', 109, 1),
       ('Coyote Runner', 110, 1),
       ('Forest Prowler ', 111, 1),
       ('Macehualtin', 112, 1),
       ('Puma Spearman', 113, 1),
       ('Tomahawk', 114, 1),
       ('Wakina Rifle', 115, 1),
       ('War Club', 116, 1),
       ('Light Cannon', 117, 1),
       ('Mantlet', 118, 1),
       ('Ram', 119, 1),
       ('Arrow Knight', 120, 1),
       ('Eagle Runner Knight', 121, 1),
       ('Jaguar Prowl Knight', 122, 1),
       ('Axe Rider', 123, 1),
       ('Bow Rider', 124, 1),
       ('Kanya Horseman', 125, 1),
       ('Musket Rider', 126, 1),
       ('Rifle Rider', 127, 1),
       ('Tashunke Prowler', 128, 1),
       ('Dog Soldier', 129, 1),
       ('Medicine Man', 130, 1),
       ('Skull Knight', 131, 1),
       ('Travois', 132, 1),
       ('Warrior', 133, 1),
       ('Warrior Priest', 134, 1),
       ('Flying Crow', 135, 1),
       ('Mansabdar Rajput', 136, 1),
       ('Mansabdar Sepoy', 137, 1),
       ('Mansabdar Gurkha', 138, 1),
       ('Mansabdar Sowar', 139, 1),
       ('Mansabdar Zamburak', 140, 1),
       ('Mansabdar Mahout Lancer', 141, 1),
       ('Mansabdar Howdah', 142, 1),
       ('Mansabdar Siege Elephant', 143, 1),
       ('Mansabdar Flail Elephant', 144, 1),
       ('Arsonist', 145, 1),
       ('Barbary Corsair', 146, 1),
       ('Black Rider', 147, 1),
       ('Comanchero', 148, 1),
       ('Dacoit', 149, 1),
       ('Elmeti', 150, 1),
       ('Fusilier', 151, 1),
       ('Hackapell', 152, 1),
       ('Highlander', 153, 1),
       ('Iron Troop', 154, 1),
       ('Jaeger', 155, 1),
       ('Jat Lancer', 156, 1),
       ('Landsknecht', 157, 1),
       ('"Li"l Bombard', 158, 1),
       ('Mameluke', 159, 1),
       ('Manchu', 160, 1),
       ('Ninja', 161, 1),
       ('Pistolero', 162, 1),
       ('Renegado', 163, 1),
       ('Ronin', 164, 1),
       ('Stradiot', 165, 1),
       ('Swiss Pikeman', 166, 1),
       ('Thuggee', 167, 1),
       ('Wokou Horseman', 168, 1),
       ('Wokou Monk', 169, 1),
       ('Wokou Pirate', 170, 1),
       ('Wokou Ronin', 171, 1),
       ('Daimyo Kiyomasa', 172, 1),
       ('Daimyo Masamune', 173, 1),
       ('Daimyo Mototada', 174, 1),
       ('Shogun Tokugawa', 175, 1),
       ('Yojimbo', 176, 1),
       ('Apache Cavalry', 177, 1),
       ('Carib Blowgunner', 178, 1),
       ('Chakram', 179, 1),
       ('Cherokee Rifleman', 180, 1),
       ('Cheyenne Rider', 181, 1),
       ('Comanche Horse Archer', 182, 1),
       ('Conquistador', 183, 1),
       ('Cree Tracker', 184, 1),
       ('Cree Coureur des Bois', 185, 1),
       ('Huron Mantlet', 186, 1),
       ('Inca Bolas Warrior', 187, 1),
       ('Inca Huaminca', 188, 1),
       ('Klamath Rifleman', 189, 1),
       ('Mapuche Ironwood Clubman', 190, 1),
       ('Maya Holcan Spearman', 191, 1),
       ('Navajo Rifleman', 192, 1),
       ('Nootka Clubman', 193, 1),
       ('Rattan Shield', 194, 1),
       ('Seminole Sharktooth Bowman', 195, 1),
       ('Sohei', 196, 1),
       ('Tiger Claw', 197, 1),
       ('Tupi Blackwood Archer', 198, 1),
       ('War Elephant', 199, 1),
       ('Zapotec Lightning Warrior', 200, 1),
       ('War Canoe', 201, 1);

INSERT INTO units_informations_types
VALUES
(1, 1), (1, 2), (1, 3), (1, 4),
(2, 2),
(3, 2),
(4, 1), (4, 3), (4, 4),
(5, 1), (5, 3), (5, 5),
(6, 1), (6, 2), (6, 10),
(7, 1), (7, 3), (7, 4),
(8, 1), (8, 2), (8, 10),
(9, 1), (9, 2), (9, 3), (9, 4),
(10, 1), (10, 3), (10, 5),
(11, 1), (11, 2), (11, 3), (11, 4),
(12, 1), (12, 2), (12, 10),
(13, 1), (13, 2), (13, 10),
(14, 1), (14, 2), (14, 10),
(15, 1), (15, 2), (15, 10),
(16, 1), (16, 2), (16, 3), (16, 4),
(17, 1), (17, 3), (17, 4),
(18, 1), (18, 3), (18, 4),
(19, 1), (19, 3), (19, 5),
(20, 1), (20, 2), (20, 10),
(21, 7), (21, 14), (21, 15), (21, 5),
(22, 7), (22, 8), (22, 9),
(23, 7), (23, 8), (23, 9),
(24, 7), (24, 14), (24, 15), (24, 16),
(25, 7), (25, 8), (25, 9),
(26, 7), (26, 8), (26, 9),
(27, 7), (27, 8), (27, 9),
(28, 7), (28, 8), (28, 9), (28, 17),
(29, 7), (29, 14), (29, 15), (29, 16),
(30, 7), (30, 8), (30, 9),
(31, 7), (31, 14), (31, 15), (31, 16),
(32, 7), (32, 14), (32, 15), (32, 5),
(33, 1), (33, 3), (33, 4),
(34, 18),
(35, 18),
(36, 18),
(37, 1), (37, 2), (37, 17), (37, 3),
(38, 1), (38, 2), (38, 3), (38, 17),
(39, 18),
(40, 18),
(41, 18),
(42, 1), (42, 17),
(43, 19), (43, 20),
(44, 19), (44, 20),
(45, 19), (45, 20),
(46, 19), (46, 20),
(47, 19), (47, 13),
(48, 19), (48, 20),
(49, 19), (49, 20),
(50, 19), (50, 20),
(51, 19), (51, 20),
(52, 19), (52, 20),
(53, 19), (53, 20),
(54, 19), (54, 20),
(55, 19), (55, 20),
(56, 19), (56, 20),
(57, 19), (57, 20),
(58, 19), (58, 20),
(59, 19), (59, 20),
(60, 18),
(61, 18),
(62, 18),
(63, 13),
(65, 1), (65, 3),
(66, 1), (66, 10), (66, 6),
(67, 13),
(68, 1), (68, 3), (68, 4), (68, 21),
(72, 1), (72, 10),
(80, 7), (80, 8), (80, 9),
(81, 7), (81, 14), (81, 15), (81, 16),
(82, 7), (82, 8), (82, 9),
(83, 7), (83, 14), (83, 15), (83, 16),
(85, 7), (85, 8), (85, 9), (85, 17),
(86, 1), (86, 3), (86, 17),
(87, 18),
(88, 18),
(90, 18),
(91, 18), (91, 14),
(92, 1), (92, 3),
(93, 1), (93, 2), (93, 10),
(94, 13), (101, 1), (101, 3), (101, 6), (101, 5),
(102, 1), (102, 2), (102, 6), (102, 10),
(104, 11),
(105, 10), (105, 12),
(106, 1), (106, 2), (106, 3), (106, 4),
(107, 19), (107, 20),
(108, 1), (108, 3), (108, 5),
(109, 1), (109, 3), (109, 5),
(110, 10), (110, 22),
(111, 1), (111, 3), (111, 4),
(112, 1), (112, 3), (112, 5),
(113, 1), (113, 2), (113, 10), (113, 17),
(114, 1), (114, 2), (114, 3), (114, 4),
(115, 1), (115, 3), (115, 4),
(116, 1), (116, 2), (116, 10),
(117, 18),
(118, 1), (118, 17), (118, 3),
(119, 1), (119, 17),
(120, 1), (120, 17), (120, 3), (120, 5),
(121, 22), (121, 3), (121, 5),
(122, 1), (122, 2), (122, 10),
(123, 7), (123, 8), (123, 9),
(124, 7), (124, 14), (124, 15), (124, 5),
(125, 7), (125, 8), (125, 9),
(126, 7), (126, 14), (126, 15), (126, 16),
(127, 7), (127, 14), (127, 15), (127, 16), (127, 8),
(128, 7), (128, 8), (128, 9),
(129, 7), (129, 8), (129, 9),
(131, 1), (131, 2), (131, 10),
(132, 23),
(133, 1), (133, 3),
(134, 1), (134, 10),
(135, 18),
(136, 1), (136, 2), (136, 10),
(137, 1), (137, 2), (137, 3), (137, 4),
(138, 1), (138, 3), (138, 4),
(139, 7), (139, 8), (139, 9),
(140, 7), (140, 14), (140, 15), (140, 16),
(141, 7), (141, 8), (141, 9),
(142, 7), (142, 14), (142, 15), (142, 16),
(143, 14), (143, 18),
(144, 7), (144, 8), (144, 9), (144, 17),
(145, 1), (145, 2), (145, 17), (145, 3),
(146, 1), (146, 2), (146, 10),
(147, 7), (147, 14), (147, 15), (147, 16),
(148, 7), (148, 14), (148, 15), (148, 16),
(149, 1), (149, 2), (149, 3), (149, 4),
(150, 7), (150, 8), (150, 9),
(151, 1), (151, 2), (151, 3), (151, 4),
(152, 7), (152, 8), (152, 9),
(153, 1), (153, 2), (153, 3), (153, 4),
(154, 1), (154, 3), (154, 5),
(155, 1), (155, 3), (155, 4),
(156, 7), (156, 8), (156, 9),
(157, 1), (157, 2), (157, 10),
(158, 18), (159, 7), (159, 8), (159, 9),
(160, 7), (160, 14), (160, 15), (160, 5),
(161, 1), (161, 2), (161, 10),
(162, 1), (162, 2), (162, 10),
(163, 1), (163, 2), (163, 3), (163, 4),
(164, 1), (164, 2), (164, 10),
(165, 7), (165, 8), (165, 9),
(166, 1), (166, 2), (166, 10),
(167, 1), (167, 3), (167, 4),
(168, 7), (168, 14), (168, 15),
(169, 1), (169, 3), (169, 5),
(170, 1), (170, 2), (170, 10),
(171, 1), (171, 2), (171, 10),
(172, 7), (172, 8), (172, 9),
(173, 7), (173, 8), (173, 9),
(174, 7), (174, 8), (174, 9),
(175, 7), (175, 8), (175, 9),
(176, 7), (176, 14), (176, 15), (176, 5),
(177, 7), (177, 14), (177, 16), (177, 6),
(178, 1), (178, 3), (178, 5), (178, 6),
(179, 1), (179, 2), (179, 3), (179, 6),
(180, 1), (180, 3), (180, 4), (180, 6),
(181, 7), (181, 8), (181, 9), (181, 6),
(182, 7), (182, 14), (182, 15), (182, 5), (182, 6),
(183, 7), (183, 14), (183, 15), (183, 16), (183, 6),
(184, 1), (184, 3), (184, 4), (184, 6),
(185, 13),
(186, 1), (186, 3), (186, 6), (186, 17),
(187, 1), (187, 5), (187, 3), (186, 6),
(188, 1), (188, 2), (188, 10), (188, 6),
(189, 1), (189, 3), (189, 4), (189, 6),
(190, 1), (190, 2), (190, 10), (190, 6),
(191, 1), (191, 2), (191, 6), (191, 10), (191, 17),
(192, 1), (192, 3), (192, 4), (192, 6),
(193, 1), (193, 2), (193, 10), (193, 6),
(194, 1), (194, 22), (194, 10), (194, 6),
(195, 1), (195, 3), (195, 5), (195, 6),
(196, 1), (196, 2), (196, 10), (196, 6),
(197, 1), (197, 22), (197, 10), (197, 6),
(198, 1), (198, 3), (198, 5), (198, 6),
(199, 7), (199, 8), (199, 9), (199, 6),
(200, 1), (200, 2), (200, 10), (200, 6),
(201, 19), (201, 20);

INSERT INTO units_informations_civilizations
VALUES
(1, 11),
(4, 6),
(5, 3), (5, 4), (5, 6), (5, 8),
(6, 4),
(7, 10),
(8, 2), (8, 2), (8, 6), (8, 7),
(9, 5),
(10, 1),
(11, 1), (11, 3), (11, 6), (11, 7), (11, 8),
(12, 1), (12, 2), (12, 3), (12, 4), (12, 6), (12, 8),
(13, 10),
(14, 8),
(15, 11),
(16, 10),
(17, 2), (17, 3), (17, 4), (17, 8),
(18, 7),
(19, 11),
(21, 5), (21, 7),
(22, 7),
(23, 3),
(24, 1), (24, 3), (24, 6), (24, 8),
(25, 1), (25, 2), (25, 3), (25, 5), (25, 6), (25, 8),
(26, 8),
(27, 11),
(28, 7),
(29, 2),
(30, 4),
(31, 4),
(32, 11),
(33, 5),
(34, 1), (34, 2), (34, 3), (34, 4), (34, 5), (34, 6), (34, 7), (34, 8),
(35, 1), (35, 2), (35, 3), (35, 4), (35, 5), (35, 7), (35, 8),
(36, 1), (36, 2), (36, 3), (36, 4), (36, 5), (36, 6), (36, 7), (36, 8),
(37, 1), (37, 2), (37, 5), (37, 7),
(39, 1), (39, 2), (39, 3), (39, 4), (39, 5), (39, 6), (39, 7), (39, 8),
(40, 1), (40, 2), (40, 3), (40, 4), (40, 5), (40, 6), (40, 7), (40, 8),
(41, 6),
(42, 1), (42, 2), (42, 3), (42, 4), (42, 5), (42, 6), (42, 7), (42, 8),
(43, 11), (44, 1), (44, 2), (44, 3), (44, 4), (44, 5), (44, 6), (44, 7), (44, 8), (44, 12), (44, 13), (44, 14),
(45, 1), (45, 2), (45, 3), (45, 4), (45, 6), (45, 7), (45, 8), (45, 10),
(46, 9),
(47, 1), (47, 2), (47, 3), (47, 4), (47, 5), (47, 6), (47, 7), (47, 8), (47, 9), (47, 10), (47, 11), (47, 12), (47, 13), (47, 14),
(48, 2),
(49, 1), (49, 2), (49, 3), (49, 4), (49, 5), (49, 6), (49, 7), (49, 8), (49, 10),
(50, 9),
(51, 11),
(52, 1), (52, 2), (52, 3), (52, 4), (52, 5), (52, 6), (52, 7), (52, 8), (52, 10),
(53, 5),
(54, 1), (54, 2), (54, 3), (54, 4), (54, 5), (54, 6), (54, 7), (54, 8),
(56, 1), (56, 2), (56, 3), (56, 4), (56, 5), (56, 6), (56, 7), (56, 8), (56, 9), (56, 10), (56, 11),
(57, 11),
(58, 9),
(59, 9), (59, 11),
(60, 5),
(61, 2), (61, 3), (61, 4), (61, 6), (61, 7), (61, 8),
(62, 1),
(63, 1), (63, 2), (63, 4), (63, 5), (63, 6), (63, 7), (63, 8),
(64, 2),
(65, 1), (65, 2), (65, 3), (65, 4), (65, 5), (65, 6), (65, 7), (65, 8),
(67, 3),
(68, 1), (68, 2), (68, 3), (68, 4), (68, 5), (68, 6), (68, 7), (68, 8),
(69, 5),
(70, 8),
(71, 1), (71, 2), (71, 3), (71, 4), (71, 6), (71, 7),
(72, 1), (72, 2), (72, 3), (72, 4), (72, 5), (72, 6), (72, 7), (72, 8),
(72, 1), (73, 2), (73, 3), (73, 4), (73, 5), (73, 6), (73, 7), (73, 8),
(74, 9),
(75, 9),
(76, 9),
(77, 9),
(78, 9),
(79, 9),
(80, 10),
(81, 10),
(82, 10),
(83, 10),
(84, 9),
(85, 10),
(86, 9),
(87, 11),
(88, 9),
(89, 9),
(90, 11),
(91, 10),
(92, 9), (92, 10), (92, 11),
(93, 9), (93, 10), (93, 11),
(94, 9), (94, 10), (94, 11), (94, 12), (94, 13), (94, 14),
(105, 1), (105, 2), (105, 3), (105, 4), (105, 5), (105, 6), (105, 7), (105, 8), (105, 9), (105, 10), (105, 11), (105, 12), (105, 13), (105, 14),
(106, 1), (106, 2), (106, 3), (106, 4), (106, 5), (106, 6), (106, 7), (106, 8),
(107, 14),
(108, 12),
(109, 13),
(110, 14),
(111, 12),
(112, 14),
(113, 14),
(114, 12),
(115, 13),
(116, 13),
(117, 12),
(118, 12),
(119, 12),
(120, 14),
(121, 14),
(122, 14),
(123, 13),
(124, 13),
(125, 12),
(126, 12),
(127, 13),
(128, 13),
(129, 13),
(130, 12), (130, 13),
(131, 14),
(132, 12),
(133, 12), (133, 13), (133, 14),
(134, 14),
(135, 9),
(136, 10),
(137, 10),
(138, 10),
(139, 10),
(140, 10),
(141, 10),
(142, 10),
(143, 10),
(144, 10),
(145, 1), (145, 2), (145, 3), (145, 4), (145, 5), (145, 6), (145, 7), (145, 8), (145, 9), (145, 10), (145, 11), (145, 12), (145, 13), (145, 14),
(146, 1), (146, 2), (146, 3), (146, 4), (146, 5), (146, 6), (146, 7), (146, 8), (146, 9), (146, 10), (146, 11), (146, 12), (146, 13), (146, 14),
(147, 1), (147, 2), (147, 3), (147, 4), (147, 5), (147, 6), (147, 7), (147, 8), (147, 9), (147, 10), (147, 11), (147, 12), (147, 13), (147, 14),
(148, 1), (148, 2), (148, 3), (148, 4), (148, 5), (148, 6), (148, 7), (148, 8), (148, 9), (148, 10), (148, 11), (148, 12), (148, 13), (148, 14),
(149, 1), (149, 2), (149, 3), (149, 4), (149, 5), (149, 6), (149, 7), (149, 8), (149, 9), (149, 10), (149, 11), (149, 12), (149, 13), (149, 14),
(150, 1), (150, 2), (150, 3), (150, 4), (150, 5), (150, 6), (150, 7), (150, 8), (150, 9), (150, 10), (150, 11), (150, 12), (150, 13), (150, 14),
(151, 1), (151, 2), (151, 3), (151, 4), (151, 5), (151, 6), (151, 7), (151, 8), (151, 9), (151, 10), (151, 11), (151, 12), (151, 13), (151, 14),
(152, 1), (152, 2), (152, 3), (152, 4), (152, 5), (152, 6), (152, 7), (152, 8), (152, 9), (152, 10), (152, 11), (152, 12), (152, 13), (152, 14),
(153, 1), (153, 2), (153, 3), (153, 4), (153, 5), (153, 6), (153, 7), (153, 8), (153, 9), (153, 10), (153, 11), (153, 12), (153, 13), (153, 14),
(154, 1), (154, 2), (154, 3), (154, 4), (154, 5), (154, 6), (154, 7), (154, 8), (154, 9), (154, 10), (154, 11), (154, 12), (154, 13), (154, 14),
(155, 1), (155, 2), (155, 3), (155, 4), (155, 5), (155, 6), (155, 7), (155, 8), (155, 9), (155, 10), (155, 11), (155, 12), (155, 13), (155, 14),
(156, 1), (156, 2), (156, 3), (156, 4), (156, 5), (156, 6), (156, 7), (156, 8), (156, 9), (156, 10), (156, 11), (156, 12), (156, 13), (156, 14),
(157, 1), (157, 2), (157, 3), (157, 4), (157, 5), (157, 6), (157, 7), (157, 8), (157, 9), (157, 10), (157, 11), (157, 12), (157, 13), (157, 14),
(158, 1), (158, 2), (158, 3), (158, 4), (158, 5), (158, 6), (158, 7), (158, 8), (158, 9), (158, 10), (158, 11), (158, 12), (158, 13), (158, 14),
(159, 1), (159, 2), (159, 3), (159, 4), (159, 5), (159, 6), (159, 7), (159, 8), (159, 9), (159, 10), (159, 11), (159, 12), (159, 13), (159, 14),
(160, 1), (160, 2), (160, 3), (160, 4), (160, 5), (160, 6), (160, 7), (160, 8), (160, 9), (160, 10), (160, 11), (160, 12), (160, 13), (160, 14),
(161, 1), (161, 2), (161, 3), (161, 4), (161, 5), (161, 6), (161, 7), (161, 8), (161, 9), (161, 10), (161, 11), (161, 12), (161, 13), (161, 14),
(162, 1), (162, 2), (162, 3), (162, 4), (162, 5), (162, 6), (162, 7), (162, 8), (162, 9), (162, 10), (162, 11), (162, 12), (162, 13), (162, 14),
(163, 1), (163, 2), (163, 3), (163, 4), (163, 5), (163, 6), (163, 7), (163, 8), (163, 9), (163, 10), (163, 11), (163, 12), (163, 13), (163, 14),
(164, 1), (164, 2), (164, 3), (164, 4), (164, 5), (164, 6), (164, 7), (164, 8), (164, 9), (164, 10), (164, 11), (164, 12), (164, 13), (164, 14),
(165, 1), (165, 2), (165, 3), (165, 4), (165, 5), (165, 6), (165, 7), (165, 8), (165, 9), (165, 10), (165, 11), (165, 12), (165, 13), (165, 14),
(166, 1), (166, 2), (166, 3), (166, 4), (166, 5), (166, 6), (166, 7), (166, 8), (166, 9), (166, 10), (166, 11), (166, 12), (166, 13), (166, 14),
(167, 1), (167, 2), (167, 3), (167, 4), (167, 5), (167, 6), (167, 7), (167, 8), (167, 9), (167, 10), (167, 11), (167, 12), (167, 13), (167, 14),
(168, 1), (168, 2), (168, 3), (168, 4), (168, 5), (168, 6), (168, 7), (168, 8), (168, 9), (168, 10), (168, 11), (168, 12), (168, 13), (168, 14),
(169, 1), (169, 2), (169, 3), (169, 4), (169, 5), (169, 6), (169, 7), (169, 8), (169, 9), (169, 10), (169, 11), (169, 12), (169, 13), (169, 14),
(170, 1), (170, 2), (170, 3), (170, 4), (170, 5), (170, 6), (170, 7), (170, 8), (170, 9), (170, 10), (170, 11), (170, 12), (170, 13), (170, 14),
(171, 1), (171, 2), (171, 3), (171, 4), (171, 5), (171, 6), (171, 7), (171, 8), (171, 9), (171, 10), (171, 11), (171, 12), (171, 13), (171, 14),
(172, 11),
(173, 11),
(174, 11),
(175, 11),
(176, 1), (176, 2), (176, 3), (176, 4), (176, 5), (176, 6), (176, 7), (176, 8), (176, 9), (176, 10), (176, 11), (176, 12), (176, 13), (176, 14),
(177, 1), (177, 2), (177, 3), (177, 4), (177, 5), (177, 6), (177, 7), (177, 8), (177, 9), (177, 10), (177, 11), (177, 12), (177, 13), (177, 14),
(178, 1), (178, 2), (178, 3), (178, 4), (178, 5), (178, 6), (178, 7), (178, 8), (178, 9), (178, 10), (178, 11), (178, 12), (178, 13), (178, 14),
(179, 1), (179, 2), (179, 3), (179, 4), (179, 5), (179, 6), (179, 7), (179, 8), (179, 9), (179, 10), (179, 11), (179, 12), (179, 13), (179, 14),
(180, 1), (180, 2), (180, 3), (180, 4), (180, 5), (180, 6), (180, 7), (180, 8), (180, 9), (180, 10), (180, 11), (180, 12), (180, 13), (180, 14),
(181, 1), (181, 2), (181, 3), (181, 4), (181, 5), (181, 6), (181, 7), (181, 8), (181, 9), (181, 10), (181, 11), (181, 12), (181, 13), (181, 14),
(182, 1), (182, 2), (182, 3), (182, 4), (182, 5), (182, 6), (182, 7), (182, 8), (182, 9), (182, 10), (182, 11), (182, 12), (182, 13), (182, 14),
(183, 1), (183, 2), (183, 3), (183, 4), (183, 5), (183, 6), (183, 7), (183, 8), (183, 9), (183, 10), (183, 11), (183, 12), (183, 13), (183, 14),
(184, 1), (184, 2), (184, 3), (184, 4), (184, 5), (184, 6), (184, 7), (184, 8), (184, 9), (184, 10), (184, 11), (184, 12), (184, 13), (184, 14),
(185, 1), (185, 2), (185, 3), (185, 4), (185, 5), (185, 6), (185, 7), (185, 8), (185, 9), (185, 10), (185, 11), (185, 12), (185, 13), (185, 14),
(186, 1), (186, 2), (186, 3), (186, 4), (186, 5), (186, 6), (186, 7), (186, 8), (186, 9), (186, 10), (186, 11), (186, 12), (186, 13), (186, 14),
(187, 1), (187, 2), (187, 3), (187, 4), (187, 5), (187, 6), (187, 7), (187, 8), (187, 9), (187, 10), (187, 11), (187, 12), (187, 13), (187, 14),
(188, 1), (188, 2), (188, 3), (188, 4), (188, 5), (188, 6), (188, 7), (188, 8), (188, 9), (188, 10), (188, 11), (188, 12), (188, 13), (188, 14),
(189, 1), (189, 2), (189, 3), (189, 4), (189, 5), (189, 6), (189, 7), (189, 8), (189, 9), (189, 10), (189, 11), (189, 12), (189, 13), (189, 14),
(190, 1), (190, 2), (190, 3), (190, 4), (190, 5), (190, 6), (190, 7), (190, 8), (190, 9), (190, 10), (190, 11), (190, 12), (190, 13), (190, 14),
(191, 1), (191, 2), (191, 3), (191, 4), (191, 5), (191, 6), (191, 7), (191, 8), (191, 9), (191, 10), (191, 11), (191, 12), (191, 13), (191, 14),
(192, 1), (192, 2), (192, 3), (192, 4), (192, 5), (192, 6), (192, 7), (192, 8), (192, 9), (192, 10), (192, 11), (192, 12), (192, 13), (192, 14),
(193, 1), (193, 2), (193, 3), (193, 4), (193, 5), (193, 6), (193, 7), (193, 8), (193, 9), (193, 10), (193, 11), (193, 12), (193, 13), (193, 14),
(194, 1), (194, 2), (194, 3), (194, 4), (194, 5), (194, 6), (194, 7), (194, 8), (194, 9), (194, 10), (194, 11), (194, 12), (194, 13), (194, 14),
(195, 1), (195, 2), (195, 3), (195, 4), (195, 5), (195, 6), (195, 7), (195, 8), (195, 9), (195, 10), (195, 11), (195, 12), (195, 13), (195, 14),
(196, 1), (196, 2), (196, 3), (196, 4), (196, 5), (196, 6), (196, 7), (196, 8), (196, 9), (196, 10), (196, 11), (196, 12), (196, 13), (196, 14),
(197, 1), (197, 2), (197, 3), (197, 4), (197, 5), (197, 6), (197, 7), (197, 8), (197, 9), (197, 10), (197, 11), (197, 12), (197, 13), (197, 14),
(198, 1), (198, 2), (198, 3), (198, 4), (198, 5), (198, 6), (198, 7), (198, 8), (198, 9), (198, 10), (198, 11), (198, 12), (198, 13), (198, 14),
(199, 1), (199, 2), (199, 3), (199, 4), (199, 5), (199, 6), (199, 7), (199, 8), (199, 9), (199, 10), (199, 11), (199, 12), (199, 13), (199, 14),
(200, 1), (200, 2), (200, 3), (200, 4), (200, 5), (200, 6), (200, 7), (200, 8), (200, 9), (200, 10), (200, 11), (200, 12), (200, 13), (200, 14),
(201, 12), (200, 13)
