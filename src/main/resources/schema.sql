CREATE TABLE rollers (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     created_by VARCHAR(255),
     created_date TIMESTAMP,
     last_modified_by VARCHAR(255),
     last_modified_date TIMESTAMP,
     marque VARCHAR(255),
     modele VARCHAR(255),
     taille VARCHAR(255),
     disponibilite BOOLEAN,
     etat VARCHAR(255)
);
