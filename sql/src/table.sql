-- table 만들기
-- table 지우기
-- table 수정하기

-- *** [table 수정하기] ***
-- alter table로 table을 수정합니다.

-- [table column 추가하기]
-- alter table [talbe 이름] add column [column 이름] [type] [constraint]

-- *** [table 만들기] ***
-- create table로 table을 만듭니다.
CREATE TABLE inapp.verification_messages (
	id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ,
	phone_number varchar NOT NULL,
	verification_code varchar NOT NULL,
	is_verified bool NOT NULL DEFAULT false,
	is_expired bool NOT NULL DEFAULT false,
	message_count smallint NOT NULL DEFAULT 0,
	created_at date NOT NULL DEFAULT now(),
	updated_at date,
	CONSTRAINT verification_messages_pk PRIMARY KEY (id)
);


-- *** [constraint 만들기] ***
-- pk 이름 [table 이름]_pkey
-- foreign key 이름
-- [table 이름]_[foreign key 이름]_fkey

-- [unique]
-- alter table [table 이름] add constraint [contraint 이름] unique ([column 이름])
-- constraint 이름: [table 이름]_[columne 이름]_key
alter table inapp.verification_messages add constraint verification_messages_phone_key unique (phone_number);
