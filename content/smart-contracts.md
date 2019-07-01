---
layout: page
title:  "Smart contracts"
section: "smart"
position: 3
---

Example Application: Verification of Smart Contracts and Clients
----------------------------------------------------------------

As an example application, we can use Stainless in automated verification of smart contracts. We have created the following fork of Stainless:

[https://github.com/epfl-lara/smart](https://github.com/epfl-lara/smart)

which shows how to:

*   write smart contracts in [Scala](https://scala-lang.org/);
*   specify and prove properties of such programs, including precise reasoning about Uint256 data types;
*   generate Solidity source code from Scala, which can then be compiled and deployed using the usual tools for the [ethereum](https://www.ethereum.org/) software ecosystem.

For example, we have modeled and verified [a voting smart contract](https://github.com/SwissBorg/voting-token/tree/master/contracts) developed by [SwissBorg](https://swissborg.com/en/) using Scala and Stainless (check [the corresponding benchmark](https://github.com/epfl-lara/smart/tree/master/frontends/benchmarks/smartcontracts/valid/Voting)).

For more information, check [the README.md](https://github.com/epfl-lara/smart/blob/master/README.md), as well as the [online documentation](https://epfl-lara.github.io/smart/) including the page on [smart contracts in Stainless](https://epfl-lara.github.io/smart/smartcontracts.html).

Our verification efforts may prove useful in the future for companies such as [AXONI](https://medium.com/axoni/axlang-formally-verifiable-smart-contracts-for-the-ethereum-ecosystem-6201203be4e8) as well. A this stage, our open source implementation of generator for Solidity is a proof of concept, which helps understand the verification challenges as well as differences and similarities of Solidity and Scala programming models.

Beyond verifying individual smart contracts, we are excited about the potential of Stainless to establish properties of clients and wallets for blockchain networks, such as the [Mantis](https://github.com/epfl-lara/mantis) client written in Scala as well as [Bitcoin-S](https://github.com/epfl-lara/bitcoin-s-core).

Finally, we are also interested in new programming models for smart contracts and understanding how they can further increase the reliability and efficiency of decentralized systems.

This direction of work with Stainless is inspired by discussions within the [EPFL Center for Digital Trust](https://c4dt.org/) of which our research group is a member.

Stainless is the result of work of many contributors, see the [main Stainless repository](https://github.com/epfl-lara/stainless). Smart contract support is in particular due to the work of [Jad Hamza](https://people.epfl.ch/jad.hamza) and [Romain Jufer](https://people.epfl.ch/romain.jufer). For more information about Stainless for blockchain technologies, please contact [Jad](https://people.epfl.ch/jad.hamza) and [Viktor](https://people.epfl.ch/viktor.kuncak).
