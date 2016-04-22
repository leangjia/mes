﻿-- added helper for master orders
-- last touched 22.04.2016 by kama

ALTER TABLE orders_order ADD COLUMN masterorderproductcomponent_id bigint;
ALTER TABLE orders_order
  ADD CONSTRAINT order_masterorderproduct_fkey FOREIGN KEY (masterorderproductcomponent_id)
      REFERENCES masterorders_masterorderproduct (id) DEFERRABLE;

-- end
