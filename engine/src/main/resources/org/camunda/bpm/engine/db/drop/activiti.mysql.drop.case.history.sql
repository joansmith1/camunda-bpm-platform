drop index ACT_IDX_HI_CAS_I_CLOSE on ACT_HI_CASEINST;
drop index ACT_IDX_HI_CAS_I_BUSKEY on ACT_HI_CASEINST;
drop index ACT_IDX_HI_CAS_A_I_CREATE on ACT_HI_CASEACTINST;
drop index ACT_IDX_HI_CAS_A_I_END on ACT_HI_CASEACTINST;
drop index ACT_IDX_HI_CAS_A_I_COMP on ACT_HI_CASEACTINST;
drop index ACT_IDX_HI_CAS_A_I_CASEINST on ACT_HI_CASEACTINST;

drop table if exists ACT_HI_CASEINST;
drop table if exists ACT_HI_CASEACTINST;
