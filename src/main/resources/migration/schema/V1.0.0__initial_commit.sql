CREATE TABLE IF NOT EXISTS products (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid() NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    category VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION NOT NULL,
    currency VARCHAR(10) NOT NULL,
    alcohol_content VARCHAR(50) NOT NULL,
    volume_ml INTEGER NOT NULL,
    available boolean default FALSE NOT NULL,
    quantity INTEGER NOT NULL,
    image_url TEXT NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL
);