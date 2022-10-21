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
	id bigint not null generated always as identity,
	-- id uuid not null default gen_random_uuid(),
	phone_number varchar not null,
	verification_code varchar not null,
	is_verified bool not null default false,
	is_expired bool not null default false,
	message_count smallint not null default 0,
	created_at timestamptz not null default now(),
	updated_at timestamptz,
	constraint verification_messages_pk primary key (id)
);


-- *** [constraint 만들기] ***
-- pk 이름 [table 이름]_pkey
-- foreign key 이름
-- [table 이름]_[foreign key 이름]_fkey

-- [unique]
-- alter table [table 이름] add constraint [contraint 이름] unique ([column 이름])
-- constraint 이름: [table 이름]_[column 이름]_key

-- [primary key]
-- alter table [table 이름] add constraint [contraint 이름] primary key ([column 이름])
-- constraint 이름: [table 이름]_[column 이름]_pkey
-- create table [table 이름] (
--   id int,
--   constraint verification_messages_pk primary key (id)
-- );

-- [foreign key]
-- alter table [table 이름] add constraint [contraint 이름] foreign key ([column 이름]) references [참조 table 이름]([참조 column in]) delete 조건
-- constraint 이름: [table 이름]_[column 이름]_fkey
