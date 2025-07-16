-- Project Name : noname
-- Date/Time    : 2025/07/16 17:41:00
-- Author       : Rei Hayakawa
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- exam_data
-- * RestoreFromTempTable
CREATE TABLE exam_data (
  id integer NOT NULL
  , japanese integer NOT NULL
  , math integer NOT NULL
  , english integer NOT NULL
  , japanese_history integer
  , world_history integer
  , geography integer
  , physics integer
  , chemistry integer
  , biology integer
  , CONSTRAINT exam_data_PKC PRIMARY KEY (id)
) ;

-- examinee
-- * RestoreFromTempTable
CREATE TABLE examinee (
  id serial NOT NULL
  , name character varying(50) NOT NULL
  , date date NOT NULL
  , CONSTRAINT examinee_PKC PRIMARY KEY (id)
) ;

COMMENT ON TABLE exam_data IS 'exam_data';
COMMENT ON COLUMN exam_data.id IS 'id';
COMMENT ON COLUMN exam_data.japanese IS 'japanese';
COMMENT ON COLUMN exam_data.math IS 'math';
COMMENT ON COLUMN exam_data.english IS 'english';
COMMENT ON COLUMN exam_data.japanese_history IS 'japanese_history';
COMMENT ON COLUMN exam_data.world_history IS 'world_history';
COMMENT ON COLUMN exam_data.geography IS 'geography';
COMMENT ON COLUMN exam_data.physics IS 'physics';
COMMENT ON COLUMN exam_data.chemistry IS 'chemistry';
COMMENT ON COLUMN exam_data.biology IS 'biology';

COMMENT ON TABLE examinee IS 'examinee';
COMMENT ON COLUMN examinee.id IS 'id';
COMMENT ON COLUMN examinee.name IS 'name';
COMMENT ON COLUMN examinee.date IS 'date';

