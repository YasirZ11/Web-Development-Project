document.addEventListener('DOMContentLoaded', () => {
    const menuItems = document.querySelectorAll('.menu li');
    const orderList = document.getElementById('order-list');
    const totalAmountElem = document.getElementById('total-amount');
    const placeOrderButton = document.getElementById('place-order');
    const generateReportButton = document.getElementById('generate-report');
    let orderTotal = 0;
    let totalSales = 0;
    let totalOrders = 0;

    menuItems.forEach(item => {
        item.addEventListener('click', () => {
            const itemName = item.getAttribute('data-item');
            const itemPrice = parseFloat(item.textContent.split('- $')[1]);
            const orderItem = document.createElement('li');
            orderItem.textContent = `${itemName} - $${itemPrice}`;
            orderList.appendChild(orderItem);
            orderTotal += itemPrice;
            totalAmountElem.textContent = orderTotal.toFixed(2);
        });
    });

    placeOrderButton.addEventListener('click', () => {
        if (orderTotal > 0) {
            totalSales += orderTotal;
            totalOrders += 1;
            orderList.innerHTML = '';
            orderTotal = 0;
            totalAmountElem.textContent = orderTotal.toFixed(2);
            alert('Order placed successfully!');
        } else {
            alert('No items in the order.');
        }
    });

    generateReportButton.addEventListener('click', () => {
        document.getElementById('total-sales').textContent = totalSales.toFixed(2);
        document.getElementById('total-orders').textContent = totalOrders;
        alert('Report generated successfully!');
    });

    const tables = document.querySelectorAll('.table');
    tables.forEach(table => {
        table.addEventListener('click', () => {
            alert(`Managing orders for ${table.textContent}`);
        });
    });

    const paymentButtons = document.querySelectorAll('.payment-btn');
    paymentButtons.forEach(button => {
        button.addEventListener('click', () => {
            alert(`Payment method: ${button.textContent}`);
        });
    });
});
