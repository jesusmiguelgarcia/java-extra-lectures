#!/bin/bash

./build.sh && java -ea -cp bin org.addressbook.tests.TestSimpleAddressBook 
./build.sh && java -ea -cp bin org.addressbook.tests.TestContact 