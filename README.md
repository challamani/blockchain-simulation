# Blockchain Simulation
Idea behind this project is to bring the blockchain technology close to people. 

Understand how crypto currency (Bitcoin) & Blockchain born together.

The initially idea might be creating digital crypto currency but in the process building/protecting/implementing that core - (satoshi nakamoto) has introduced blockchain technology.

**Blockchain** is a digitally distributed, decentralized and immutable chain. (once you create a block in block-chain you cannot edit/remove it from the blockchain)   

1. Transparent
2. Secure
3. Immutable
4. Decentralized

List of Blockchain databases - BigChainDB / Cassandra / ChainifyDB / PostChain / ProvenDB - (internally uses MongoDB), 

This simulator not using above of the above database systems - in this project everything is in-memory operation may be in long run - I'll try to achieve multi-node write once Blockchain.  

How Blockchain solved below problems

1. Security - no middle man can attack (block encrypted with previous block SHA).
2. Double spending problem (once you've given something from you then no-longer you'll have that money/house/car/smart-contracts blah blah blah)
3. No financial institue is required for processing your transaction (P2P). 


Everything is in-memory operation, you might encounter heap-memory related errors at runtime (when you try with huge number of records)

Planning to integrate with *camunda BPMN engine* to get in-memory transactions, so you won't encounter any jvm heap errors at runtime.
