CREATE TABLE public.company
(
    id bigint,
    company_name text,
    location text,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.company
ADD COLUMN clients bigint null;

ALTER TABLE IF EXISTS public.company
ADD COLUMN phno bigint null;

ALTER TABLE IF EXISTS public.company
ADD COLUMN employees bigint null;

ALTER TABLE IF EXISTS public.company
ADD COLUMN projects bigint null;


