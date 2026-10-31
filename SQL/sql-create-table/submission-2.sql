CREATE TABLE videos (
    id  Integer,
    name  varchar(50),
    createdAt  Date,
    published  Boolean
);






-- Do not modify below this line --
SELECT table_name, column_name, data_type
FROM information_schema.columns
WHERE table_name = 'videos';
