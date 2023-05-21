create table messages (
    id bigint not null generated always as identity,
    -- id uuid not null default gen_random_uuid(),
    author_id varchar,
    content varchar not null,
    is_deleted bool not null default false,
    created_at timestamptz not null default nw(),
    updated_at timestamptz,
    constraint messages_id_pk primary key (id),
    constraint messsages_author_id_fk foreign key (author_id) references users (id) on delete set null
);

-- default 없애기
alter table [table 이름] alter [column 이름] drop default;


-- [constraint 추가하기]
-- * unique key
alter table [table 이름] add constraint [contraint 이름] unique ([column 이름])
constraint 이름: [table 이름]_[column 이름]_key

-- * primary key
alter table [table 이름] add constraint [constraint 이름] primary key ([column 이름])
constraint 이름: [table 이름]_[column 이름]_pkey

-- * foreign key
alter table [table 이름] add constraint [contraint 이름] foreign key ([column 이름]) references [참조 table 이름]([참조 column in]) on delete [조건]
constraint 이름: [table 이름]_[column 이름]_fkey

-- * default 추가하기
alter table [table 이름] alter column [column 이름] set default [value]

-- * not null 추가하기
alter table  [table 이름] alter [column 이름] set not null;

-- [constraint 지우기]
-- * constraint 지우기
alter table [table 이름] drop constraint [constraint 이름]

-- * default 지우기
alter table [table 이름] drop constraint [constraint 이름]

-- * not null 지우기
alter table [table 이름] alter column [column 이름] drop not null
