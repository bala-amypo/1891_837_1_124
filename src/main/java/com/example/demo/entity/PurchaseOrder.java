PurchaseOrder

Fields:

id (Long, PK)

poNumber (String, unique)

supplier (ManyToOne Supplier)

category (ManyToOne SpendCategory)

amount (BigDecimal)

dateIssued (Date)

approvedBy (String)

notes (String)

Rules:

Amount must be > 0.

Date cannot be in the future.

