create table LMS_LMSBook (
	bookId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookTitle VARCHAR(75) null,
	author VARCHAR(75) null
);

create table LMS_LMSBorrowing (
	borrowingId LONG not null primary key,
	bookId LONG,
	memberId LONG,
	dateBorrowed DATE null,
	dateReturned DATE null
);