DELIMITER $$
CREATE TRIGGER addToInventory AFTER INSERT ON book
FOR EACH ROW 
BEGIN 
	INSERT INTO inventory(book_id, quantity) VALUES(NEW.id, 0);
END $$
DELIMITER ;