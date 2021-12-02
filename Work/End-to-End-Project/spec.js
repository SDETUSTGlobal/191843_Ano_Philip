describe('SmartBear Demo', () => {
    it('SmartBear Login Page', () => {
        browser.get('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
        browser.getCurrentUrl()
        .then((url) => {
        expect(url).toBe('http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx');
    });


    it('User login credentials and login', () => {
        element (by.name ('ctl00$MainContent$username')).sendkeys ('Tester');
        element (by.name ('ctl00_MainContent_password')).sendkeys ('test');
        element (by.name ('ctl00$MainContent$login_button')).click();
        expect(url).toBe('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx');
     });


    it('View all order page ', () => {
        element (by.linkText ('View all orders')).click();
        expect(title).toBe('List of All Orders');
    }); 

    it('View all product page', () => {
        element (by.linkText ('View all products')).click();
        expect(title).toBe('List of Products');
    }); 

    it('Orders page', () => {
        element (by.linkText ('Order')).click();
        expect(title).toBe('Order');
    });
});
});