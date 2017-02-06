create index IX_59DA0D4C on LMS_LMSBook (bookId);
create index IX_7896CF6B on LMS_LMSBook (bookTitle);
create index IX_6001C2AA on LMS_LMSBook (bookTitle, author);

create index IX_2893E746 on LMS_LMSBorrowing (bookId);