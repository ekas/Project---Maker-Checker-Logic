select * from userdataek;
select * from tempCustEk;
commit


create table permCustEk as select * from tempCustEk where 1=0;

desc permCustEk
select  * from permCustEk

update tempCustEk set recStatus = 'N' where custCode = 'dsds';

INSERT INTO permCustEk(custId,custName,custName,authBy)
  SELECT 'ekae' FROM tempCustEk where custCode = 'dsds';

delete from permCustEk
create sequence sk_permCustEk
    