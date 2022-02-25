CREATE TABLE inapp.counsels (
	cousel_id int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
	bank_id varchar NOT NULL,
	appraiser_id varchar NOT NULL,
	client_id int8 NOT NULL,
	is_on_counsel bool NOT NULL DEFAULT false,
	CONSTRAINT counsels_pkey PRIMARY KEY (cousel_id)
);

CREATE TABLE inapp.counsels (
	cousel_id int8 NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	bank_id varchar NOT NULL,
	appraiser_id varchar NOT NULL,
	client_id int8 NOT NULL,
	is_on_counsel bool NOT NULL DEFAULT false,
	CONSTRAINT counsels_pkey PRIMARY KEY (cousel_id)
);
